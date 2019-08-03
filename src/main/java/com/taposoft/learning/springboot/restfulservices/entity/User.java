package com.taposoft.learning.springboot.restfulservices.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
public @Data class User {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Size(min = 2)
	private String firstName;
	@Size(min = 2)
	private String lastName;
	@Email
	private String email;
	private String phoneNumber;
}
