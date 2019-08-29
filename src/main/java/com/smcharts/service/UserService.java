package com.smcharts.service;

import java.util.List;
import java.util.Optional;

import com.smcharts.model.User;

public interface UserService {

	public List<User> getUsers();

	public User createUser(User user);

	public Optional<User> getUserById(Long userId);

}
