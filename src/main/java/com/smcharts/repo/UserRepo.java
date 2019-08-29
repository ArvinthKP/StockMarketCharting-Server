package com.smcharts.repo;

import org.springframework.data.repository.CrudRepository;

import com.smcharts.model.User;

public interface UserRepo extends CrudRepository<User, Long> {

}
