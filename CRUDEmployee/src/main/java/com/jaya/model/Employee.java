package com.jaya.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee 
{
  @Id
  @Column
  @GeneratedValue(strategy=GenerationType.AUTO)
  private int empId;
  @Column
  private String name;
  @Column
  private String doj;
  @Column
  private String dob;
  @Column
  private String address;
   
  public Employee(){}

public Employee(int empId, String name, String doj, String dob, String address) {
	super();
	this.empId = empId;
	this.name = name;
	this.doj = doj;
	this.dob = dob;
	this.address = address;
}

public int getEmpId() {
	return empId;
}

public void setEmpId(int empId) {
	this.empId = empId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDoj() {
	return doj;
}

public void setDoj(String doj) {
	this.doj = doj;
}

public String getDob() {
	return dob;
}

public void setDob(String dob) {
	this.dob = dob;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}
  
  
}