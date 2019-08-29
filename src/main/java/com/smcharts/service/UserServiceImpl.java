package com.smcharts.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smcharts.model.User;
import com.smcharts.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo userRepo;

	@Override
	public List<User> getUsers() {
		return (List<User>) userRepo.findAll();
	}

	@Override
	public User createUser(User user) {
		return userRepo.save(user);
	}

	@Override
	public Optional<User> getUserById(Long userId) {
		return (Optional<User>) userRepo.findById(userId);
	}

}
