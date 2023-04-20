package com.example.demo.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.module.Employee;
import com.example.demo.repo.EmployeeRepo;
import com.example.demo.service.Employeeservice;

@Service
public class EmployeeserviceImp implements Employeeservice
{

	@Autowired
	EmployeeRepo repo;

	@Override                                       //save data
	public Employee addemployee(Employee e)        
	{
		return repo.save(e);
	}


	@Override                                      //get data
	public Employee getByemployeeId(Integer eid) {
		return repo.findById(eid).orElseThrow(()-> new ResourceNotFoundException("Employee","Id",eid));
	}

	@Override
	public List<Employee> getByemployeeDesignation(String designation) {
		return repo.findByDesignation(designation);
	}

	@Override
	public List<Employee> getByemployeeLessSal(Double sal) {
		return repo.findByLessSal(sal);
	}

	
	@Override                                          //update data
	public Employee updateemployee(Employee e) 
	{
		Employee e1=repo.findById(e.getEid()).orElseThrow(()-> new ResourceNotFoundException("Employee","Id",e));
		if(e1!=null)
		{
			e1.setEname(e.getEname());
			e1.setDesignation(e.getDesignation());
			e1.setSal(e.getSal());
			e1.setPhno(e.getPhno());
			return repo.save(e1);
		}
		else
		{
			throw new ResourceNotFoundException("Employee","id", e.getEid());
		}
	}
	
	 
	@Override                                             //delete data
	public void deleteemployeeById(Integer eid) 
	{
		repo.deleteById(eid);
		
	}
}