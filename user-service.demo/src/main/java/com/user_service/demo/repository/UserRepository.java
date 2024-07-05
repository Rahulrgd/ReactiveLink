package com.user_service.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user_service.demo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
