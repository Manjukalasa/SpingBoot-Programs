package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

//localhost:8080
@Controller                          
public class HomeController
{
	@RequestMapping("/home")         //localhost:8080/home
	public String form()
	{
		return "form.jsp";	 
	}
	
	@RequestMapping("index")         //auto return the output
	public String index(HttpSession h1,Student s)
	{
		h1.setAttribute("sname",s.getSname());
		h1.setAttribute("sid",s.getSid());
		return "index.jsp";	 
	}
}