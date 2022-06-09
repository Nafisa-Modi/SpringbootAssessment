package com.springbootassessment.service;

import java.util.List;

import com.springbootassessment.model.Role;

import java.util.List;

public interface RoleService {

	boolean addRole(Role role);
	
	List<Role> findAllRoles();
 
}
