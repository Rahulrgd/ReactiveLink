package com.webClient.demo.service;

import com.webClient.demo.config.UserProps;
import com.webClient.demo.model.User;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@Slf4j
public class UserService {

  private UserProps userProps;
  private WebClient webClient;

  public UserService(UserProps userProps, WebClient webClient) {
    this.userProps = userProps;
    this.webClient = WebClient.create(userProps.getBaseurl());
  }

  public User getUser(Integer id) {
    log.info("baser url :{}", userProps.getBaseurl());
    User user = webClient
      .get()
      .uri("/{id}", id)
      .retrieve()
      .bodyToMono(User.class)
      .block();
    return user;
  }

  public List<User> getAllUser(){
        User[] users = webClient.get()
                .uri("/")
                .retrieve()
                .bodyToMono(User[].class)
                .block();
        return Arrays.stream(users).toList();
    }
}
