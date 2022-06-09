package com.springbootassessment.service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootassessment.model.User;
import com.springbootassessment.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepo; 
	
	@Override
	public Integer saveUser(User user) {
		
		return userRepo.save(user).getId();
	}

	
	

}