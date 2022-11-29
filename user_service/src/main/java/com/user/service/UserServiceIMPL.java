package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserServiceIMPL implements UserService
{
	//fake user list
	
	List<User> list=List.of(
			new User(1311, "Ashwani Chaurasiya", "7007581106"),
			new User(1312, "Anuradha Chaurasiya", "6386608574"),
			new User(1313, "Anushawi", "8896545088")
			);
	
	@Override
	public User getUser(Integer id) 
	{
		return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
	}
	
}
