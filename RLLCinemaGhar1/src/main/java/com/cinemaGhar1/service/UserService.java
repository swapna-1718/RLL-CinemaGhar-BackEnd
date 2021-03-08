package com.cinemaGhar1.service;

import java.util.List;

import com.cinemaGhar1.dao.entity.User;

public interface UserService {
	
	public Boolean insert(User user);
	public List<User> getAllUsers();
	
	public List<User> update(User user);
	public List<User> delete(long id);
	public List<User> getUserByEmail(String email) ;
	public String getEmail(String email);
	public String getPassword(String email);
	 public List<User> getUserById(long id);
	public User getUser(String email);
	
}