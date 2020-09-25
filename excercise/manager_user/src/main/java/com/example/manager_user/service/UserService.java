package com.example.manager_user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.manager_user.entity.User;

@Service
public interface UserService {
	public List<User> findAllByName(String name);
}
