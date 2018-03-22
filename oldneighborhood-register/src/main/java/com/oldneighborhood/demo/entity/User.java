package com.oldneighborhood.demo.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;


import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * 
* @ClassName: User  
* @Description: User注册用户的实体类
* @author user005  
* @date 2018年3月21日  
*
 */
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Builder

public class User implements Serializable{
	
	private static final long serialVersionUID = 3179473115848813375L;
	@NonNull
	private String u_ID;
	@NonNull
	private String u_name;
	@NonNull
	private String u_password;
	
	private String u_image;
	private Integer u_score;
	@NonNull
	private String u_tele;
	private String u_email;
	@NonNull
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date u_birthday;
	private String u_signature;
	private Timestamp u_date;

}
