package com.user_service.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user_service.demo.model.User;
import com.user_service.demo.repository.UserRepository;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User getUser(Integer id){
        try{
            return userRepository.findById(id).get();
        }catch (Exception e){
            return new User();
        }

    }
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
    public User addUser(User user){
        return userRepository.save(user);
    }
}
