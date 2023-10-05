package com.example.Springbootproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Springbootproject.model.User;
import com.example.Springbootproject.repo.UserRepository;

@RestController
public class UserController {
		
	@Autowired
	UserRepository userRepository;
	
	@PostMapping("/userSave")
	public String insertUser(@RequestBody User user) {
		userRepository.save(user);
		return "User is successfully saved";
	}
	
	@GetMapping("/getUsers")
	public List<User> getUsers() {
		return (List<User>)userRepository.findAll(); 
	}
}
