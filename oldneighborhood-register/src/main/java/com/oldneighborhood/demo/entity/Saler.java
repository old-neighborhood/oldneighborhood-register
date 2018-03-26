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

@Entity
@Table(name="saler")
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Builder

public class Saler implements Serializable{
	
	private static final long serialVersionUID = -1696099100838066036L;
	
	@Id
	private String s_ID;
	@NonNull
	private String s_name;
	@NonNull
	private String s_password;
	@NonNull
	private String s_tele;
	
	@Column(columnDefinition="varchar(500) default 'classpath:/icons-portrait.png'")
	private String s_image;
	private Integer s_score;
	private String s_email;
	private String s_address;
//	@DateTimeFormat(pattern="yyyy-MM-dd") //标注改属性只接收指定格式的日期  默认  yyyy/MM/dd
//	private Date s_birthday;
	private String s_signature;
	@Column(columnDefinition="timestamp not null default now()" , updatable=false)
	private Timestamp s_date;

}
