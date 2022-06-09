package com.springbootassessment.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootassessment.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	
}