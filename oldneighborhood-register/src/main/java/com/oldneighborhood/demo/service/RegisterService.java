package com.oldneighborhood.demo.service;


import com.oldneighborhood.demo.entity.User;
import com.oldneighborhood.demo.entity.UserType;

/**
 * 
* @ClassName: RegisterService  
* @Description: 注册服务接口，isLegal-检测user对象是否合法，signup插入一条用户信息
* @author user005  
* @date 2018年3月22日  
*
 */
public interface RegisterService {
	
	public boolean signup(User user);
	
	public boolean isLegal(User user);
	
	public String genID();

}
