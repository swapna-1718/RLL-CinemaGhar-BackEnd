package com.cinemaGhar1.service;

import java.util.List;

import com.cinemaGhar1.dao.entity.Admin;

public interface AdminService {
 
	public Boolean insert(Admin admin);
	public List<Admin> getAdminById(String id);
	public String getAdminEmail(String email);
	public String getAdminPassword(String email);
	public Admin getAdmin(String email);

}