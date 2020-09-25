package com.example.manager_user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.manager_user.entity.User;
import com.example.manager_user.repository.UserRepository;
import com.example.manager_user.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	private UserRepository userRepository;
	
	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	@Override
	public List<User> findAllByName(String name) {
		return userRepository.findAllByName(name);
	}
}
