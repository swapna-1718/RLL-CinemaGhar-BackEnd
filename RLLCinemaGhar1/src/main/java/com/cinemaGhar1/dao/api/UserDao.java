package com.cinemaGhar1.dao.api;

import java.util.List;

import com.cinemaGhar1.dao.entity.User;

public interface UserDao 
{
	public Boolean insert(User user);
	public List<User> getAllUsers();
	public List<User> getUserById( long id);
	public List<User> getUserByEmail(String email);
	public List<User> update(User user);
	public List<User> delete(long id);
	
    
	 public String getPassword(String email);
	 public String getEmail(String email);
	//public List<User> getUserById(Long id);
	 public String getUserEmail(String email);
	 public String getUserPassword(String email);
	 public User getUser(String email);
	

	
}