package com.springbootassessment.repository;

import org.springframework.stereotype.Repository;

import com.springbootassessment.model.Role;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository("roleRepository")
public interface RoleRepository extends JpaRepository<Role, Integer> {

}
