package com.taposoft.learning.springboot.restfulservices.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Entity
@ApiModel(description = "This is the user details class.")
public @Data class User {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Size(min = 2)
	@ApiModelProperty(notes = "Should be of minimum 2 characters.")
	private String firstName;
	@Size(min = 2)
	@ApiModelProperty(notes = "Should be of minimum 2 characters.")
	private String lastName;
	@Email
	@ApiModelProperty(notes = "Should be a proper email format.")
	private String email;
	private String phoneNumber;
}
