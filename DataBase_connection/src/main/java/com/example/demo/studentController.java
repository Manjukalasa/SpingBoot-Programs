package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class studentController
{
	@Autowired
	StudentRepo repo;
	@RequestMapping("/addstudent")    // localhost:8080/addstudent
	public String addstudent()
	{
		return "details.jsp";
		
	}
	@RequestMapping("savestudent")     //Js file calling savestudent
	public String savesudtudent(Student s)
	{
		repo.save(s);               //save data (inbuilt method extends CrudRepository interface) 
		return "details.jsp";
	}
}