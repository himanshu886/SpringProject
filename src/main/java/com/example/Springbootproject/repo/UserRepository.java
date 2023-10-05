package com.example.Springbootproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Springbootproject.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
