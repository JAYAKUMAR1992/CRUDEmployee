package com.jaya.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jaya.dao.EmployeeDao;
import com.jaya.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao
{
	@Autowired
	private SessionFactory session;

	@Override
	public void add(Employee employee) {
		// TODO Auto-generated method stub
		session.getCurrentSession().save(employee);
	}

	@Override
	public void edit(Employee employee) {
		// TODO Auto-generated method stub
		session.getCurrentSession().update(employee);
	}

	@Override
	public void delete(int empId) {
		// TODO Auto-generated method stub
		session.getCurrentSession().delete(getEmployee(empId));
	}

	@Override
	public Employee getEmployee(int empId) {
		return (Employee)session.getCurrentSession().get(Employee.class,empId);
	}

	@Override
	public List getAllEmployee() 
	{
	  return session.getCurrentSession().createQuery("from Employee").list();	
	}

}
