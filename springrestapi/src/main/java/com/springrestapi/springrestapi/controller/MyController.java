package com.springrestapi.springrestapi.controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.springrestapi.springrestapi.entities.Users;
import com.springrestapi.springrestapi.services.UserService;

@RestController
public class MyController {
	
	@Autowired
	private UserService userService;
	
	
	
	//get the users
	@GetMapping("/users")
	public List<Users> getUsers() {
		return this.userService.getUsers();
	}
	
	@GetMapping("/users/{userId}")
	public Users getUsers(@PathVariable String userId) {
		return this.userService.getUsers(Long.parseLong(userId));
	}
	
	
	
//	@PostMapping("/users")
//	public Users addUser(@Valid @RequestBody Users user) {
//		return this.userService.addUser(user);
//	}
	
	@PostMapping("/users")
	public  ResponseEntity<Users> addUser(@Valid @RequestBody Users user){
		Users savedUser = userService.addUser(user);
		return new ResponseEntity<Users>(savedUser, HttpStatus.CREATED);
	}
	
	@PutMapping("/users")
	public Users updateUser(@Valid @RequestBody Users user) {
		return this.userService.updateUser(user);
	}
	
	
	@DeleteMapping("/users/{userId}")
	public  ResponseEntity<HttpStatus> deleteUser(@PathVariable String userId) {
		try {
			this.userService.deleteUser(Long.parseLong(userId));
			return new ResponseEntity<>(HttpStatus.OK);
			
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
