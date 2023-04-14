package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

//localhost:8080
@Controller                          
public class HomeController
{
	@RequestMapping("/login")       //localhost:8080/login---------->it returns login.jsp file
	public String loginpage()
	{
		return "login.jsp";	 
	}

	@RequestMapping("validate")         //auto return the validate file output
	public String validateuser(String email,String password)
	{
		if(email.equals("manju123@gmail.com")&&password.equals("Manju@123"))
		{
			return "welcome.jsp";	  
		}
		return "error.jsp";
	}
}