package com.springbootassessment.controller;


import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springbootassessment.model.User;
import com.springbootassessment.service.UserService;

@Controller
@RequestMapping("/user")
public class UserRestController {
	
	@Autowired
	private UserService userService;
	public UserRestController()
	{
		System.out.println("########  User RestController created#############");
		
	}
	/*{
	"username": "Rani",
	"roles": ["moderator"]
	}*/
	
	//localhost:1212/user
	@PostMapping()
	public ResponseEntity<String> saveUser(@RequestBody User user) {
		
		Integer id = userService.saveUser(user);
		String message= "User with id '"+id+"' saved succssfully!";
		return ResponseEntity.ok(message);
	}
	
	
}