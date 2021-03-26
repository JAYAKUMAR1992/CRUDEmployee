package com.jaya.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.jaya.dao.EmployeeDao;
import com.jaya.model.Employee;
import com.jaya.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    
	@Autowired
	private EmployeeDao employeeDao;
	
	@Transactional
	public void add(Employee employee) 
	{
	  employeeDao.add(employee);
	} 

	@Transactional
	public void edit(Employee employee) 
	{
	  employeeDao.edit(employee);
	}

	@Transactional
	public void delete(int empId) 
	{
	  employeeDao.delete(empId);
	}

	@Transactional
	public Employee getEmployee(int empId) {
		return employeeDao.getEmployee(empId);
	}

	@Transactional
	public List getAllEmployee() {
		return employeeDao.getAllEmployee();
	}

}
