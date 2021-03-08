package com.cinemaGhar1.dao.api;

import java.util.List;

import com.cinemaGhar1.dao.entity.PaymentInfo;

public interface PaymentInfoDao
{
	public boolean insert(PaymentInfo payment);
	public List<PaymentInfo> getAllPaymentInfo();
	//public List<PaymentInfo> getPaymentById(Long paymentId);
	 public List<PaymentInfo> getPaymentById(String paymentId);
	
}