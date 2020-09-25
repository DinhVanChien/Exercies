package com.example.manager_user.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.manager_user.database.UserData;
import com.example.manager_user.entity.User;
import com.example.manager_user.repository.UserRepository;

@Repository
public class UserRepositoryImpl implements UserRepository{
	@Override
	public List<User> findAllByName(String name) {
		List<User> listUser = UserData.userData();
		List<User> listUserFindNane = new ArrayList<User>();
		for(User u : listUser) {
			if(u.getName().equals(name)) {
				listUserFindNane.add(u);
			}
		}
		return listUserFindNane;
	}
}
