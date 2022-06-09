package com.springbootassessment.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootassessment.model.Role;
import com.springbootassessment.repository.RoleRepository;


@Service("roleServiceRepositoryImpl")
public class RoleServiceImpl implements RoleService{


@Autowired
private RoleRepository roleRepository;


@Override
public boolean addRole(Role role) {
	return roleRepository.save(role)==role;
}

@Override
public List<Role> findAllRoles() {
		return roleRepository.findAll();
}


	}
