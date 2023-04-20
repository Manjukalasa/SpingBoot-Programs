package com.example.demo.service;

import java.util.List;

import com.example.demo.module.Employee;

public interface Employeeservice
{
	public Employee addemployee(Employee e);  //save data
	
	
	
	
	public Employee getByemployeeId(Integer eid);  //get data
	
	public List<Employee> getByemployeeDesignation(String designation);
	
	public List<Employee> getByemployeeLessSal(Double sal);
	
	
	
	public Employee updateemployee(Employee e);  //update data
	
	
	
	public void deleteemployeeById(Integer eid); //delete data
}
