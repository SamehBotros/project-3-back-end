package com.project3.revtech.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project3.revtech.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}