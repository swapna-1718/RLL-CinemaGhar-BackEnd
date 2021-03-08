package com.cinemaGhar1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cinemaGhar1.dao.api.PaymentInfoDao;
import com.cinemaGhar1.dao.entity.PaymentInfo;
@Service
@Transactional
public class PaymentInfoServiceImpl implements PaymentInfoService {
	
	@Autowired
	private PaymentInfoDao paymentInfoDao;

	@Override
	public Boolean insert(PaymentInfo payment) {
		return paymentInfoDao.insert(payment);
	}

	@Override
	public List<PaymentInfo> getAllpaymentInfo() {
		return paymentInfoDao.getAllPaymentInfo();
	}

	@Override
	public List<PaymentInfo> getAllpaymentInfoById(String id) {
		return paymentInfoDao.getPaymentById(id);
	}

}