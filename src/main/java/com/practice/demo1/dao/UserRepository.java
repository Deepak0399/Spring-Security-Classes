package com.practice.demo1.dao;

import com.practice.demo1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<String, User> {

    Optional<User> findByUserName(String username);
}
