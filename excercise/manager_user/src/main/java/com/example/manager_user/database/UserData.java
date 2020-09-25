package com.example.manager_user.database;

import java.util.ArrayList;
import java.util.List;

import com.example.manager_user.entity.User;

public class UserData {
	public static List<User> userData() {
		List<User> listUser = new ArrayList<User>();
		User user1 = new User(1, "Chien", 25);
		User user2 = new User(2, "Tấn", 23);
		User user3 = new User(3, "Tấn", 21);
		User user4 = new User(4, "Quỳnh", 20);
		listUser.add(user1);
		listUser.add(user2);
		listUser.add(user3);
		listUser.add(user4);
		return listUser;
	}
}
