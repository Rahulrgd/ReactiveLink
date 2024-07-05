package com.webClient.demo.controller;

import com.webClient.demo.model.User;
import com.webClient.demo.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/webclient-users")
public class WebClientController {

  @Autowired
  private UserService userService;

  @GetMapping("/{id}")
  public User getUser(@PathVariable Integer id) {
    return userService.getUser(id);
  }

  @GetMapping("/")
  public List<User> getUser() {
    return userService.getAllUser();
  }

  @PostMapping("/")
  public User getUser(@RequestBody User user) {
    return userService.addUser(user);
  }
}
