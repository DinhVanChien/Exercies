package com.example.manager_user.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.manager_user.entity.User;

@Repository
public interface UserRepository {
	public List<User> findAllByName(String name);
}
