package com.cinemaGhar1.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.cinemaGhar1.dao.api.TicketDao;
import com.cinemaGhar1.dao.entity.Ticket;

@Repository
@EnableTransactionManagement
public class TicketDaoImpl implements TicketDao 
{
	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() {
		return (Session)sessionFactory.getCurrentSession();
	}


	@Override
	public List<Ticket> getTicketByNumber(Long ticketId) 
	{
		Query query = getSession().createQuery("From Ticket tk where id=:id");
		query.setParameter("id",ticketId);
		List<Ticket> userTicket=query.list();
		return userTicket;
	}

	@Override
	public List<Ticket> getAllTickets() 
	{
		Query query = getSession().createQuery("select tk from Ticket tk ");
		List<Ticket> ticketList=query.list();
		return ticketList;
	}


	@Override
	public List<Ticket> getLastInsertedTicket()
	{
		Query query = getSession().createQuery("select max(tk.id) from Ticket tk");
		Long ticketId=(Long) query.uniqueResult();
		
		Query query2 = getSession().createQuery("From Ticket tk where id=:id");
		query2.setParameter("id",ticketId);
		List<Ticket> userTicket=query2.list();
		return userTicket;
		
	}

}