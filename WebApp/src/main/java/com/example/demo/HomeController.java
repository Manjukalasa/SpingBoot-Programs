package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpSession;

//localhost:8080
@Controller                           // make class as controller class of web services
public class HomeController
{

	@RequestMapping("/app")         //localhost:8080/app  
	public String display(HttpSession h1)
	{
		h1.setAttribute("value", "mbk");
		return "home.jsp";	 
	}
                                     //take inputs from user side
	@RequestMapping("/app1")         //localhost:8080/app1?name=manju
	public String display1(HttpSession h1,String name)
	{
		h1.setAttribute("value", name);
		return "home.jsp";	 
	}
	@RequestMapping("/app2")         //localhost:8080/app2?name=manju&id=101
	public String display2(HttpSession h1,String name,int id)
	{
		h1.setAttribute("value", name+" "+id);
		return "home.jsp";	 
	}
	@RequestMapping("/std")         //localhost:8080/std?sname=mbk&sid=111
	public String display3(HttpSession h1,Student s)
	{
		h1.setAttribute("value",s);
		return "home.jsp";	 
	}
}