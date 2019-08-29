package com.smcharts.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smcharts.model.User;
import com.smcharts.service.UserService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping(path = "/users")
	public List<User> getUsers() {
		
		return userService.getUsers();
	}

	@PostMapping(path = "/user/create")
	public User createUser(@RequestBody User user) {
		
		User _user = userService.createUser(user);
		return _user;
	}

	@GetMapping(path = "/user/{userId}")
	public Optional<User> getUserById(@PathVariable Long userId) {
		
		return userService.getUserById(userId);
	}
}
