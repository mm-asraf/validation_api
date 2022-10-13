package com.springrestapi.springrestapi.services;

import java.util.List;

import com.springrestapi.springrestapi.entities.Users;

public interface UserService {

	public List<Users> getUsers();
	
	public Users getUsers(long userId);
	
	public Users addUser(Users user);
	
	public Users updateUser(Users user);
	
	public void deleteUser(long parseLong);
}
