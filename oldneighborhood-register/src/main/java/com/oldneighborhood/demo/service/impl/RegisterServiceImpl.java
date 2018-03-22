package com.oldneighborhood.demo.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oldneighborhood.demo.dao.UserDao;
import com.oldneighborhood.demo.entity.User;
import com.oldneighborhood.demo.service.RegisterService;

@Service
public class RegisterServiceImpl implements RegisterService{
	
	@Autowired
	private UserDao userDao;
	
	/**
	 * 注册功能分为普通用户与商户
	 */
	@Override
	public boolean signup(User user) {
		// TODO Auto-generated method stub
//		if (user.getUsertype()==UserType.USER) {
//			return registerDao.userSignup(user);
//		}else if (user.getUsertype()==UserType.SALER) {
//			return registerDao.salerSignup(user);
//		}else {
//			System.out.println("无其他类型");
//			return false;
//		}
		System.out.println(user.getU_ID());
		return userDao.userSignup(user.getU_ID(), user.getU_name(), user.getU_password(),
				user.getU_image(), user.getU_score(), user.getU_tele(), user.getU_email(), 
				user.getU_birthday(), user.getU_signature());
	}

	@Override
	public boolean isLegal(User user) {
		
		return false;
	}

	//@desc 赋予用户ID
	@Override
	public String genID() {
		// TODO Auto-generated method stub
		
		return null;
	}

}
