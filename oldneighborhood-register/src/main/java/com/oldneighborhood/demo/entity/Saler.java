//package com.oldneighborhood.demo.entity;
//
//import java.io.Serializable;
//import java.sql.Timestamp;
//import java.util.Date;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//import org.springframework.format.annotation.DateTimeFormat;
//
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import lombok.NonNull;
//import lombok.RequiredArgsConstructor;
//
//@Entity
//@Table(name="")
//@NoArgsConstructor
//@AllArgsConstructor
//@RequiredArgsConstructor
//@Data
//@Builder
//
//public class Saler implements Serializable{
//	private static final long serialVersionUID = -4689353556227143131L;
//	
//	@Id
//	private String u_ID;
//	@Column(length=100)
//	@NonNull
//	private String u_name;
//	@Column(length=100)
//	@NonNull
//	private String u_password;
//	
//	@NonNull
//	private String u_image;
//	@NonNull
//	private Integer u_score;
//	private String u_tele;
//	private String u_email;
//	private String u_address;
//	@NonNull
//	@DateTimeFormat(pattern="yyyy-MM-dd") //标注改属性只接收指定格式的日期  默认  yyyy/MM/dd
//	private Date u_birthday;
//	private String u_signature;
//	@Column(columnDefinition="timestamp not null default now()" , updatable=false)
//	private Timestamp u_date;
//
//}
