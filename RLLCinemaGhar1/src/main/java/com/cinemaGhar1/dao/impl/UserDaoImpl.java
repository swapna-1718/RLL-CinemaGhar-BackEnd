package com.cinemaGhar1.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.cinemaGhar1.dao.api.UserDao;
import com.cinemaGhar1.dao.entity.User;

@Repository
@EnableTransactionManagement
public class UserDaoImpl implements UserDao
{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	protected Session getSession() {
		return (Session)sessionFactory.getCurrentSession();
	}

	@Override
	public Boolean insert(User user) {
		getSession().saveOrUpdate(user);
		System.out.println(" " +user.getName()+" stored in the DB !!!");
		return true;
	}
	

	@Override
	public List<User> getAllUsers() {
		Query query = getSession().createQuery("select us from User us ");
		List<User> userList=query.list();
		return userList;
	}

	
	
	
	@Override
	public  List <User> getUserById(long id) {
		Query query = getSession().createQuery("From User where id =:id");
		query.setParameter("id", id);
		
		List<User> userList=query.list();
		if(userList.isEmpty()) {
			System.out.println(" not Found!!");
		}
		return userList;

	}

	public  List <User> getUserByEmail(String userEmail) {
		Query query = getSession().createQuery("From User where email =:email");
		query.setParameter("email", userEmail);
		
		List<User> userList=query.list();
		if(userList.isEmpty()) {
			System.out.println("user not Found!!");
		}
		return userList;

	}
	
	
	
	@Override
	public List<User> update(User user) {
Query query = getSession().createQuery("update  User us set  name=:name,email=:email,pwd=:pwd,dob=:dob where id=:id");
query.setParameter("name",user.getName());
		query.setParameter("email", user.getEmail());
		query.setParameter("pwd",user.getPwd());
		
		query.setParameter("dob",user.getDob());
		query.setParameter("id",user.getId());
		query.executeUpdate();
		return getAllUsers();
	}

	@Override
	public List<User> delete(long id) {
		Query query = getSession().createQuery("delete from User us where id=:id");
		query.setParameter("id", id);
		query.executeUpdate();
		return getAllUsers();
	}


	@Override
	public String getEmail(String email) {
		Query query =getSession().createQuery("select us.email from User us where email=:email");
		query.setParameter("email",email); 
		String email1=(String) query.uniqueResult();
		System.out.println(email1); 
		return email1;
	}



	@Override
	public String getPassword(String email) {
		Query query=getSession().createQuery("select us.pwd from User us where email=:email");
		  query.setParameter("email",email); 
		  String password=(String)
		  query.uniqueResult(); 
		  System.out.println(password); 
		  return password;
	}


	@Override
	public String getUserEmail(String email)
	{
		Query query = getSession().createQuery("Select us.email From User us where email=:email");
		query.setParameter("email", email);
		String emailId=(String) query.uniqueResult();
		return emailId;
	}

	
	@Override
	public String getUserPassword(String email)
	{
		Query query = getSession().createQuery("Select us.pwd From User us where email=:email");
		query.setParameter("email", email);
		String password=(String) query.uniqueResult();
		return password;
	}



	@Override
	public User getUser(String email) {
		Query query = getSession().createQuery("From User us where email=:email");
		query.setParameter("email",email);
		User user=(User) query.uniqueResult();
		return user;
	}
	

	
	

	
		
}