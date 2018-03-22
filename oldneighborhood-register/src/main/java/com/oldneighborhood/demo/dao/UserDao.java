package com.oldneighborhood.demo.dao;


import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.oldneighborhood.demo.entity.User;

public interface UserDao extends JpaRepository<User, String>{
	@Modifying //update/delete操作需要
	@Query(
			value = "insert into user (u_id, u_name, u_password, u_image, u_score, u_tele, u_email, u_birthday, u_signature) values (?, ?, ?, ?, ?, ?, ?, ?, ? )", 
			nativeQuery = true)
	public int userSignup(String u_ID, String u_name, String u_password, String u_image, Integer u_score, String u_tele, String u_email, Date u_birthday, String u_signature);
}
