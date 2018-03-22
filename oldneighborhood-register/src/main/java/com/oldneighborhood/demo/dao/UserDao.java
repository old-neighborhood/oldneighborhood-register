package com.oldneighborhood.demo.dao;


import java.sql.Timestamp;
import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.oldneighborhood.demo.entity.User;

public interface UserDao extends JpaRepository<User, String>{
	@Query(
			value = "insert into user (u_ID, u_name, u_password, u_image, u_score, u_tele, u_email, u_birthday, u_signature) values (?, ?, ?, ?, ?, ?, ?, ?, ? )", 
			nativeQuery = true)
	public boolean userSignup(String u_ID, String u_name, String u_password, String u_image, Integer u_score, String u_tele, String u_email, Date birthday, String u_signature);
}
