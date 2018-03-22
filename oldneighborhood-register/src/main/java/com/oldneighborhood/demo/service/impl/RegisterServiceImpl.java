package com.oldneighborhood.demo.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
	@Transactional //在进行update/delete操作时需要加上，也可以自行修改管理
	public boolean signup(User user) {
		System.out.println(user.getU_ID());
		int result = userDao.userSignup(user.getU_ID(), user.getU_name(), user.getU_password(),
				user.getU_image(), user.getU_score(), user.getU_tele(), user.getU_email(), 
				user.getU_birthday(), user.getU_signature());
		return result == 1 ? true : false;
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
