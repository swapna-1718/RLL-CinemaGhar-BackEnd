package com.cinemaGhar1.dao.api;

import java.util.List;

import com.cinemaGhar1.dao.entity.Admin;

public interface AdminDao
{
	public boolean insert(Admin admin);
	public List<Admin> getAdminById(String adminId);
	public Admin getAdmin(String email);
	
	
}