package com.taposoft.learning.springboot.restfulservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taposoft.learning.springboot.restfulservices.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
