package com.jaya.dao;

import java.util.List;
import com.jaya.model.Employee;

public interface EmployeeDao 
{
  public void add(Employee employee);
  public void edit(Employee employee);
  public void delete(int empId);
  public Employee getEmployee(int empId);
  public List getAllEmployee();
}
