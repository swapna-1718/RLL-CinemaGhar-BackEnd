package com.cinemaGhar1.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cinemaGhar1.dao.api.TheatersDao;
import com.cinemaGhar1.dao.entity.Theaters;

@Repository 
public class TheaterDaoImpl implements TheatersDao {

	@Autowired
	SessionFactory sessionFactory;
	
	protected Session getSession() {
		return (Session)sessionFactory.getCurrentSession();
	
	}
	
	@Override
	public Boolean insert(Theaters theater) {
		getSession().saveOrUpdate(theater);
		System.out.println(theater.getId()+" "+ theater.getName());
		return true;
		
	}

	@Override
	public List<Theaters> getAllTheaters() {
		Query query = getSession().createQuery("select th from Theaters th ");
		List<Theaters> theaterList=query.list();
		return theaterList;
		
		
	}

	@Override
	public List<Theaters> getTheaterById(String id) {
		Query query = getSession().createQuery("From Theaters th where id:=id");
		query.setParameter("id",id);
		List<Theaters> theaterList=query.list();
		return theaterList;
		
		
	}

	
}
