package com.cinemaGhar1.testController;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cinemaGhar1.controller.AdminRestController;
import com.cinemaGhar1.controller.UserRestController;


//-----------------------------------------------------------------------------------
//************************JUNIT TESTING MODULE***************************************
//-----------------------------------------------------------------------------------

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/dispserv-servlet.xml" })
public class UserTestController 
{
	@Autowired
	private UserRestController userRestController;
	
	@Autowired
	private AdminRestController adminRestController;
	
	
	//UNIT-TEST FOR CHECK SUCCESSFUL LOGIN OF USER
	//********************************************
	@Test
	public void userLoginSuccessProcesstest() 
	{
		System.out.println("User Validation to check PASS ");
		
		String expectedloginS="user exists";
		
		String actualloginS =  userRestController.login("swapna@gmail.com", "1234");
		
		assertEquals(expectedloginS, actualloginS);
		
	}
	
	//UNIT-TEST FOR CHECK UNSUCCESSFUL LOGIN OF USER
	//***********************************************
	@Test
	public void userLoginFailProcesstest() 
	{
		System.out.println("User Validation to check FAIL ");
		
		String expectedloginF="Invalid email";
		
		String actualloginF = userRestController.login("s@gmail.com", "1");
		assertEquals(expectedloginF, actualloginF);
		
	}
	
	//UNIT-TEST FOR CHECK SUCCESSFUL LOGIN OF ADMIN
	//*********************************************
	@Test
	public void adminLoginSuccessProcesstest() 
	{
		System.out.println("Admin Validation to check PASS ");
		
		String expectedloginS="Welcomeadmin@gmail.com";
		
		String actualloginS =  adminRestController.adminValidate("admin@gmail.com", "admin");
		
		assertEquals(expectedloginS, actualloginS);
		
	}
	
	//UNIT-TEST FOR CHECK UNSUCCESSFUL LOGIN OF ADMIN
	//***********************************************
	@Test
	public void adminLoginFailProcesstest() 
	{
		System.out.println("Admin Validation to check FAIL");
		
		String expectedloginF="Invalid ADMIN";
		
		String actualloginF = adminRestController.adminValidate("sip@com","1");
		assertEquals(expectedloginF, actualloginF);
		
	}

}