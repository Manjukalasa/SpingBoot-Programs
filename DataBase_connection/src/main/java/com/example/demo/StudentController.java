package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpSession;

@Controller
public class StudentController
{
	@Autowired
	StudentRepo repo;
	
	@RequestMapping("/addstudent")    // localhost:8080/addstudent
	public String addstudent()
	{
		return "details.jsp";
		
	}
	@RequestMapping("savestudent")     //details Jsp file calling savestudent API
	public String savesudtudent(Student s)
	{
		repo.save(s);               //save data (predefind funtion extends CrudRepository interface) 
		return "details.jsp";
	}
	
	@RequestMapping("getById")     //detailsJsp file calling details API
	public String getById(HttpSession h1, Integer sid)
	{
		Student s=repo.findById(sid).orElse(null); // find details (predefind funtion extends CrudRepository interface) 
		h1.setAttribute("sname", s.getSname());
		h1.setAttribute("sid", s.getSid());
		h1.setAttribute("email", s.getEmail());
		h1.setAttribute("phno", s.getPhno());
		return "view.jsp";
	}
	
	@RequestMapping("deleteById")     //detailsJsp file calling details API
	public String deleteById(HttpSession h1, Integer sid)
	{
		Student s=repo.findById(sid).orElse(null); 
		if(s!=null)
		{
			h1.setAttribute("message", "Student "+sid+" Id details got deleted");
		repo.deleteById(sid);	
		}
		else
		{
			h1.setAttribute("message", "Invalid Student "+sid+" Id");	
		}
		return "details.jsp";
	}
	
	@RequestMapping("updateById")  
	public String updateById(HttpSession h1, Integer sid,String sname)
	{
		Student s=repo.findById(sid).orElse(null); 
		if(s!=null)
		{
			s.setSname(sname);
			repo.save(s);          
			h1.setAttribute("message1", "Student "+sid+" Id details got Updated");
			return "details.jsp";
		}
		else
		{
			h1.setAttribute("message1", "Invalid Student "+sid+" Id");	
			return "details.jsp";
		}
	}

	@RequestMapping("/getByEmail")     //  localhost:8080/getByEmail?email=manjunathkalasa123@gmail.com
	@ResponseBody
	public List<Student> getByEmail(String email)
	{
		System.out.println( repo.findByEmail(email));//     Object--> [Student [sid=101, sname=manjukalasa, email=manjunathkalasa123@gmail.com, phno=7795543450]]
		                                             // json format-> [{"sid":101,"sname":"manjukalasa","email":"manjunathkalasa123@gmail.com","phno":7795543450}]
		return repo.findByEmail(email);   // output in json farmat (jackson converting Object int0 json format)  
	}
	
	@RequestMapping("/getByAllPhnoorder")     //  localhost:8080/getByAllPhnoorder
	@ResponseBody
	public List<Student> getByAllPhnoorder()
	{
		return repo.findByPhnoorder();   
	}
	
	@RequestMapping("/getByName")     //  http://localhost:8080/getByName?sname=mbk
	@ResponseBody
	public List<Student> getByName(String sname)
	{
		                                 // json format-> [{"sid":101,"sname":"manjukalasa","email":"manjunathkalasa123@gmail.com","phno":7795543450}]
		return repo.findByName(sname);   // output in json farmat (jackson converting Object int0 json format)  
	}
}