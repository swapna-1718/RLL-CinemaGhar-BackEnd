package com.cinemaGhar1.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cinemaGhar1.dao.entity.Admin;
import com.cinemaGhar1.dao.entity.User;
import com.cinemaGhar1.service.AdminService;
import com.cinemaGhar1.service.UserService;




@RestController
@CrossOrigin(origins="http://localhost:4200")
public class AdminRestController
{
	@Autowired
	AdminService adminService;
	
	@Autowired
	UserService userService;
	
	@PostMapping("/createAdmin")
	public Admin createAdmin(@RequestBody Admin admin)
	{
		adminService.insert(admin);
		return admin;
		
	}
	@GetMapping("/adminById/{adminid}")
	public List<Admin> searchAdmin(@PathVariable("adminid") String id)
	{
		return adminService.getAdminById(id);
		
	}
	/*@GetMapping("/adminByEmail/{email}")
	public List<Admin> searchAdminByEmail(@PathVariable("email") String email)
	{
		return adminService.getAdminByEmail(email);
		
	}*/
	@GetMapping("/admin/getAllUser")
	public List<User> getAllUser()
	{
		
		return userService.getAllUsers();
		
	}
	
	@DeleteMapping("/delete/{id}")
	public List<User> deleteUser(@PathVariable("id") long id)
	{
		return userService.delete(id);
		
	}
	@GetMapping("/admin/validate/{adminId}/{emailId}/{password}")
	public List<Admin> validateAdmin(@PathVariable("adminId") String id,@PathVariable("emailId") String emailid,
			@PathVariable("password") String password)
	{
		
		List<Admin> admin=new ArrayList<Admin>();
		admin=adminService.getAdminById(id);
		return (List<Admin>) admin.get(0);
		
	}
	
	@GetMapping("/adminValidate/'{email}'/{pass}")
	public String adminValidate(@PathVariable("email") String email,
								@PathVariable("pass") String pwd)
	{
		String userName=adminService.getAdminEmail(email);
		String password=adminService.getAdminPassword(email);
		if(userName!=null)
		{
			if(userName.equals(email) && password.equals(pwd))
			{
				System.out.println("Welcome "+userName);
				System.out.println("Login Successful");
				return "Welcome"+userName;
			}
			else
			{
				return "Login UnSuccessful Try Again";
			}
		}
		else
		{
			return "Invalid ADMIN";
		}
	}
	
	@GetMapping("/login/admin/{email:.+}")
	private ResponseEntity<Admin> adminLogin(@PathVariable("email") String email)
			 
	{
		Admin admin=adminService.getAdmin(email);
		System.out.println(admin);
		
		if(admin==null)
		{
			return new ResponseEntity<Admin>(HttpStatus.NO_CONTENT);
		}
		
	
		else
		{
			return new ResponseEntity<Admin>(admin,HttpStatus.OK);
		}
	}
}