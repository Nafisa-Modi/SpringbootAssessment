package com.springbootassessment.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="users")
public class User {

	@Id
	@GeneratedValue
	@Column(name="user_id")
	private Integer id;
	
	@Column(name="user_name")
	private String username;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Set<String> getRoles() {
		return roles;
	}
	public void setRoles(Set<String> roles) {
		this.roles = roles;
	}

	public User() {
		super();
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", roles=" + roles + "]";
	}

	public User(Integer id, String username, Set<String> roles) {
		super();
		this.id = id;
		this.username = username;
		this.roles = roles;
	}

	@ElementCollection(fetch= FetchType.EAGER)
	@CollectionTable(
			name="user_roles",
			joinColumns = @JoinColumn(name="user_id")
			)
	@Column(name="role")
	private Set<String> roles;


	/*@ManyToMany
	@JoinTable(name="user_roles",
	joinColumns = @JoinColumn(name="user_id"),
	           inverseJoinColumns=@JoinColumn(name="role_id"))
	private Set<Role> role=new HashSet<>();*/


	
	
}