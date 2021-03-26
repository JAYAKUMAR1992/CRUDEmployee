package com.jaya.service;

import java.util.List;

import com.jaya.model.Employee;

public interface EmployeeService
{
	  public void add(Employee employee);
	  public void edit(Employee employee);
	  public void delete(int empId);
	  public Employee getEmployee(int empId);
	  public List getAllEmployee();
}
