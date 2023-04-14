package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

//localhost:8080

@Controller
public class WebController {
	@RequestMapping("/login")  //localhost:8080/login
	public String loginpage()
	{
		return "login.jsp";
	}

	@RequestMapping("find")
	public String findstd(HttpSession h1,Student s)
	{
		if(s.getSid().charAt(0)=='Q'||s.getSid().charAt(0)=='q')
		{
			h1.setAttribute("org", "Qspiders");
			h1.setAttribute("sid", s.getSid());
			h1.setAttribute("sname", s.getSname());
			h1.setAttribute("phno", s.getPhno());
			h1.setAttribute("bid", s.getBid());
			h1.setAttribute("bname", s.getBname());
			return "spider.jsp";

		}
		else  if(s.getSid().charAt(0)=='J'||s.getSid().charAt(0)=='j')
		{
			h1.setAttribute("org", "Jspiders");
			h1.setAttribute("sid", s.getSid());
			h1.setAttribute("sname", s.getSname());
			h1.setAttribute("phno", s.getPhno());
			h1.setAttribute("bid", s.getBid());
			h1.setAttribute("bname", s.getBname());
			return "spider.jsp";
		}
		else
		{
			h1.setAttribute("invalid", "Invalid Student id found!!");
			return "error.jsp";
		}
	}
}