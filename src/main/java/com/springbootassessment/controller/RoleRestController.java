package com.springbootassessment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootassessment.model.Role;
import com.springbootassessment.service.RoleService;

@CrossOrigin
@RequestMapping("/roles")
@RestController
public class RoleRestController {
	@Autowired
	private RoleService roleService;
	public RoleRestController()
	{
		System.out.println("########  RoleRestController created#############");
		
	}
	
	//localhost:1212/roles
	/*
	 {"roleName":"admin"}*/
		@PostMapping
		public List<Role> addRole(@RequestBody Role role) {
			  roleService.addRole(role);
			  return roleService.findAllRoles();
		}
		
		//localhost:1212/roles
		@GetMapping
		public List<Role> getAllRoles()
		{
			return roleService.findAllRoles();
		}
		
}
