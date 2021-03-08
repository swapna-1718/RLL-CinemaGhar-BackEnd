package com.cinemaGhar1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cinemaGhar1.dao.entity.User;
import com.cinemaGhar1.service.UserService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class UserRestController
{
	@Autowired
	UserService userService;
	//Admin admin;
	
	@PostMapping("/createUser")
	public User createUser(@RequestBody User user)
	{
		userService.insert(user);
		return user;
		
	}
	
	@PutMapping("/update")
	private ResponseEntity<List<User>> updateUser(@RequestBody User user) {

		List<User> li = userService.update(user);
		if (li.isEmpty()) {
			return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);
			}

		return new ResponseEntity<List<User>>(li, HttpStatus.OK);
	}
	

	@GetMapping("/getById/{userid}")
	public List<User> searchUser(@PathVariable("userid") long id)
	{
		
		return userService.getUserById(id);
		
	}
	
	
	@GetMapping("/getUser/{email:.+}")
	public User searchByEmail(@PathVariable("email") String email)
	{
		return userService.getUser(email);
	
	}
	
	
	@GetMapping("/login/validate/'{email}'/{password}")
	public String login(@PathVariable("email") String email,
			@PathVariable("password") String pass )
	{
		String emailVal=userService.getEmail(email);
		String pass1=userService.getPassword(email);
		if(emailVal==null)
		{
			return "Invalid email";
		}
		
		else if (emailVal.equals(email) && pass1.equals(pass))
			
		{
			
			return "user exists";
		}
		else
		{
			return "user not exist";
		}
	}
	
	
	
	
	@GetMapping("/login/validate/{email:.+}")
	private ResponseEntity<User> login(@PathVariable("email") String email)
			 
	{
		User user=userService.getUser(email);
		System.out.println(user);
		
		if(user==null)
		{
			return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
		}
		
	
		else
		{
			return new ResponseEntity<User>(user,HttpStatus.OK);
		}
	}
	

	

	
}