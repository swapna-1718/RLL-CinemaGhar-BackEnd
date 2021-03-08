package com.cinemaGhar1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cinemaGhar1.dao.api.UserDao;
import com.cinemaGhar1.dao.entity.User;
@Service
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public Boolean insert(User user) {
		return userDao.insert(user);
	}

	@Override
	public List<User> getAllUsers() {
	return userDao.getAllUsers();
	}

	
	@Override
	public List<User> getUserById(long id) {
		return userDao.getUserById(id);
	}

	@Override
	public List<User> update(User user) {
		return userDao.update(user);
	}

	@Override
	public List<User> delete(long id) {
		return userDao.delete(id);
	}

	@Override
	public String getEmail(String email) {
		return userDao.getEmail(email);
	}

	@Override
	public String getPassword(String email) {
		return userDao.getPassword(email);
	}

	@Override
	public List<User> getUserByEmail(String email) {
		
		return userDao.getUserByEmail(email);
	}

	@Override
	public User getUser(String email) {
		return userDao.getUser(email);
	}

	

}