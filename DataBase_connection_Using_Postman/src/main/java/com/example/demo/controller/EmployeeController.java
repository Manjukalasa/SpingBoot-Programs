package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.module.Employee;
import com.example.demo.service.Employeeservice;

@RestController                   // RestController=@controller+@ResponceBody
public class EmployeeController
{
	@Autowired
	Employeeservice es;

	@PostMapping("/addemployee")  // localhost:8080/addemployee
	public ResponseEntity<Employee> addemployee(@RequestBody Employee e)	
	{
		return new ResponseEntity<Employee>(es.addemployee(e), HttpStatus.CREATED);
	}
	
	
	
	@GetMapping("/getemployeeById")  // localhost:8080/getemployeeById
	public ResponseEntity<Employee> getemployeeById(@RequestHeader Integer eid)	
	{
		return new ResponseEntity<Employee>(es.getByemployeeId(eid),HttpStatus.FOUND);
	}
	
	@GetMapping("/getemployeeBydesignation")  // localhost:8080/getemployeeBydesignation
	public ResponseEntity<List<Employee>> getemployeeBydesignation(@RequestHeader String designation)	
	{
		return new ResponseEntity<List<Employee>>(es.getByemployeeDesignation(designation),HttpStatus.FOUND);
	}
	
	@GetMapping("/getemployeeByLessSal")  // localhost:8080/getemployeeByLessSal
	public ResponseEntity<List<Employee>> getemployeeByLessSal(@RequestHeader Double sal)	
	{
		return new ResponseEntity<List<Employee>>(es.getByemployeeLessSal(sal),HttpStatus.FOUND);
	}
	
	
	
	@PutMapping("/updateemployee")  // localhost:8080/updateemployee
	public ResponseEntity<Employee> updateemployee(@RequestBody Employee e)	
	{
		return new ResponseEntity<Employee>(es.updateemployee(e),HttpStatus.OK);
	}
	
	
	
	@DeleteMapping("/deleteemployeeById")  // localhost:8080/deleteemployeeById
	public void deleteemployeeById(@RequestHeader Integer eid)	
	{
		es.deleteemployeeById(eid);
	}
}
