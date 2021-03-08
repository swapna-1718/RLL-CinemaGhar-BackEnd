package com.cinemaGhar1.service;

import java.util.List;

import com.cinemaGhar1.dao.entity.PaymentInfo;

public interface PaymentInfoService {
	
	public Boolean insert(PaymentInfo payment);
	public List<PaymentInfo> getAllpaymentInfo();
	public List<PaymentInfo> getAllpaymentInfoById(String id);



}