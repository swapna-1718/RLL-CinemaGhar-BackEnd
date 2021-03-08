package com.cinemaGhar1.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.cinemaGhar1.dao.api.AdminDao;
import com.cinemaGhar1.dao.entity.Admin;

@Repository
@EnableTransactionManagement
public class AdminDaoImpl implements AdminDao 
{
	@Autowired
	SessionFactory sessionFactory;

	protected Session getSession() {
		return (Session)sessionFactory.getCurrentSession();
	}	

	@Override
	public boolean insert(Admin admin) 
	{
		//admin.setId("5");
		getSession().saveOrUpdate(admin);
		System.out.println("admin " + admin.getName()+" stored in the DB !!!");
		return true;
	}

	@Override
	public List<Admin> getAdminById(String adminId) 
	{
		Query query = getSession().createQuery("From Admin where id =:id");
		query.setParameter("id", adminId);
		
		List<Admin> adminList=query.list();
		if(adminList.isEmpty()) {
			System.out.println("Admin not Found!!");
		}
		return adminList;
	}
	
	
	@Override
	public Admin getAdmin(String email) {
		Query query = getSession().createQuery("From Admin ad where email=:email");
		query.setParameter("email",email);
		Admin admin=(Admin) query.uniqueResult();
		return admin;
	}


	
	
}