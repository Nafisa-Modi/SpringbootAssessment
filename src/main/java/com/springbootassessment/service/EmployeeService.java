package com.springbootassessment.service;


import java.util.List;

import com.springbootassessment.model.Employee;

public interface EmployeeService {
	
	boolean addEmployee(Employee employee);
	List<Employee> findAllEmployees();
 
}
