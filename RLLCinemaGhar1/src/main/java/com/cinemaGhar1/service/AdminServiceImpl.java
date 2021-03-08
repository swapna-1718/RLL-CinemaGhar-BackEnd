package com.cinemaGhar1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cinemaGhar1.dao.api.AdminDao;
import com.cinemaGhar1.dao.entity.Admin;
@Service
@Transactional
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminDao adminDao;

	@Override
	public Boolean insert(Admin admin) {
		return adminDao.insert(admin);
	}

	@Override
	public List<Admin> getAdminById(String id) {
		return adminDao.getAdminById(id);
	}

	
	@Override
	public String getAdminPassword(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin getAdmin(String email) {
		return adminDao.getAdmin(email);
	}

	@Override
	public String getAdminEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}