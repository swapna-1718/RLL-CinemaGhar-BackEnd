package com.cinemaGhar1.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.cinemaGhar1.dao.api.PaymentInfoDao;
import com.cinemaGhar1.dao.entity.PaymentInfo;

@Repository
@EnableTransactionManagement
public class PaymentInfoDaoImpl implements PaymentInfoDao
{
	@Autowired
	SessionFactory sessionFactory;
	
	protected Session getSession() {
		return (Session)sessionFactory.getCurrentSession();
	
	}

	@Override
	public boolean insert(PaymentInfo payment) 
	{
		try {

			getSession().saveOrUpdate(payment);
			System.out.println("admin " + payment.getTime()+" stored in the DB !!!");
			return true;

		} catch (Exception e) {

			System.out.println("Exception(ADD): " + e);
			return false;

		}
	}

	@Override
	public List<PaymentInfo> getAllPaymentInfo()
	{
		Query query =getSession().createQuery("select p from PaymentInfo p ");
		List<PaymentInfo> paymentList=query.list();
		return paymentList;
	}

	
	@Override
	public List<PaymentInfo> getPaymentById(String paymentId)
	{
		Query query = getSession().createQuery("From PaymentInfo p where id:=id");
		query.setParameter("id",paymentId);
		List<PaymentInfo> paymentList=query.list();
		return paymentList;
	}
	
}