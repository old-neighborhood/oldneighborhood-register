package com.oldneighborhood.demo.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
/**
 * 
* @ClassName: User  
* @Description: User注册用户的实体类
* @author user005  
* @date 2018年3月21日  
*
 */
public class User implements Serializable{
	
	private static final long serialVersionUID = 3179473115848813375L;
	
	private String u_ID;
	private String u_name;
	private String u_password;
	
	private String u_image;
	private int u_score;
	private String u_tele;
	private String u_email;
	private String u_address;
	private Date u_birthday;
	private String u_signature;
	
	private Timestamp u_date;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 * @desc all
	 */
	public User(String u_ID, String u_name, String u_password, String u_image, int u_score, String u_tele,
			String u_email, String u_address, Date u_birthday, String u_signature, Timestamp u_date) {
		super();
		this.u_ID = u_ID;
		this.u_name = u_name;
		this.u_password = u_password;
		this.u_image = u_image;
		this.u_score = u_score;
		this.u_tele = u_tele;
		this.u_email = u_email;
		this.u_address = u_address;
		this.u_birthday = u_birthday;
		this.u_signature = u_signature;
		this.u_date = u_date;
	}
	/**
	 * 
	 * @desc without u_ID & u_date
	 *  
	 */
	public User(String u_name, String u_password, String u_image, int u_score, String u_tele, String u_email,
			String u_address, Date u_birthday, String u_signature) {
		super();
		this.u_name = u_name;
		this.u_password = u_password;
		this.u_image = u_image;
		this.u_score = u_score;
		this.u_tele = u_tele;
		this.u_email = u_email;
		this.u_address = u_address;
		this.u_birthday = u_birthday;
		this.u_signature = u_signature;
	}
	
	/**
	 * 
	 * @desc only use u_name, u_password & u_tele
	 * 注册时候使用，仅输入 name, password, tele
	 */
	public User(String u_name, String u_password, String u_tele) {
		super();
		this.u_name = u_name;
		this.u_password = u_password;
		this.u_tele = u_tele;
	}

	@Override
	public String toString() {
		return "User [u_ID=" + u_ID + ", u_name=" + u_name + ", u_password=" + u_password + ", u_image=" + u_image
				+ ", u_score=" + u_score + ", u_tele=" + u_tele + ", u_email=" + u_email + ", u_address=" + u_address
				+ ", u_birthday=" + u_birthday + ", u_signature=" + u_signature + ", u_date=" + u_date + "]";
	}
	
	
	

}
