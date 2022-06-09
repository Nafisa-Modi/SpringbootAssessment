package com.springbootassessment.model;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="employees")
public class Employee implements Serializable {
	@Id
	 private int employeeId;
	 private String fname;
    private String lname;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Employee(int employeeId, String fname, String lname) {
		super();
		this.employeeId = employeeId;
		this.fname = fname;
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", fname=" + fname + ", lname=" + lname + "]";
	}
	public Employee() {
		super();
	}
    
}