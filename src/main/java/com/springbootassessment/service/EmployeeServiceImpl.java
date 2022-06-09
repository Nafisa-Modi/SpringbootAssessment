package com.springbootassessment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootassessment.model.Employee;
import com.springbootassessment.repository.EmployeeRepository;


@Service("employeeServiceRepositoryImpl")
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
@Override
public boolean addEmployee(Employee employee) {
	return employeeRepository.save(employee)==employee;
}

@Override
public List<Employee> findAllEmployees() {
	
	return employeeRepository.findAll();
}


	}
