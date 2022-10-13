package com.springrestapi.springrestapi.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrestapi.springrestapi.dao.UserDao;
import com.springrestapi.springrestapi.entities.Users;

@Service
public class UserServicesImpl implements UserService {
	
//	List<Users> list;
	
	@Autowired
	private UserDao userDao;
	
	public UserServicesImpl() {
		

		
	}

	@Override
	public List<Users> getUsers() {

		return userDao.findAll();

	}

	
	
	
	@SuppressWarnings("deprecation")
	@Override
	public Users getUsers(long userId) {
		
//		Users u = null;
//		for(Users user:list) {
//			if(user.getId() == userId) {
//				u = user;
//				break;
//			}
//		}
//		return u;
//		

		return userDao.getOne(userId);
		
		
		
	}

	@Override
	public Users addUser(Users user) {
//		list.add(user);
//		return user;
		return userDao.save(user);
		
	}

	@Override
	public Users updateUser(Users user) {
		
//		list.forEach(e -> {
//			if(e.getId() == user.getId()) {
//				e.setName(user.getName());
//				e.setDesignation(user.getDesignation());
//			}
//		});
//		
//		return user;
		
		userDao.save(user);
		return  user;
	}

	@Override
	public void deleteUser(long parseLong) {
	
//		list = this.list.stream().filter(e-> e.getId() != parseLong).collect(Collectors.toList());
		
		
		@SuppressWarnings("deprecation")
		Users entity = userDao.getOne(parseLong);
		userDao.delete(entity);
	}

	

	
}
