package com.oldneighborhood.demo.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


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
@Entity
@Table(name="user")
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Builder

public class User implements Serializable{
	
	private static final long serialVersionUID = 3179473115848813375L;
	@Id
	private String u_ID;
	@NonNull
	private String u_name;
	@NonNull
	private String u_password;
	
	@Column(columnDefinition="varchar(500) default 'classpath:/icons-portrait.png' ")
	private String u_image;
	@Column(columnDefinition="int(5) default 0")
	private Integer u_score;
	@NonNull
	private String u_tele;
	private String u_email;
//	@DateTimeFormat(pattern="yyyy-MM-dd")
//	private Date u_birthday;
//	private String address;
	private String u_signature;
	@Column(columnDefinition="timestamp not null default now()" , updatable=false)
	private Timestamp u_date;

}
