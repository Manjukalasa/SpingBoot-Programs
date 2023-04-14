package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

                                       //localhost:8080
@Controller                           // make class as controller class of web services
public class WebController
{
	                                     //localhost:8080/home 
	@RequestMapping("/home")           // Receives the request from wed pages
	@ResponseBody                     //it is used to send the response to web page
	public String home()
	{
     return "<h1>manju</h1> Kalasa ";	 
	}
	
                                     //localhost:8080/home1?name=manju
	@RequestMapping("/home1")         // Receives the request from wed pages
	@ResponseBody
	public String home1(String name)
	{
     return "Hello :"+ name;	 
	}
}
