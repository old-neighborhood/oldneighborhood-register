//package com.oldneighborhood.demo.dao;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//
//import com.oldneighborhood.demo.entity.Saler;
//
//public interface SalerDao extends JpaRepository<Saler, String>{
//	@Query(value = "insert into User() value(?1,?2)", nativeQuery = true)
//	public boolean salerSignup(Saler saler);
//}