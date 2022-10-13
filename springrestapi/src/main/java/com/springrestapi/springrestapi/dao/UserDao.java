package com.springrestapi.springrestapi.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrestapi.springrestapi.entities.Users;

public interface UserDao extends JpaRepository<Users, Long> {

	List<Users> findAll();

}
