package com.oldneighborhood.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oldneighborhood.demo.dao.UserDao;
import com.oldneighborhood.demo.entity.Saler;
import com.oldneighborhood.demo.entity.User;
import com.oldneighborhood.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	/**
	 * 注册功能分为普通用户与商户
	 */
	@Override
//	@Transactional // 在进行update/delete操作时需要加上，也可以自行修改管理
	public boolean userSignup(User user) {
		if (!isLegal(user)) {
			return false;
		}
		user.setU_ID(genID());
		System.out.println(user.getU_ID());
		
		 userDao.save(user);
//		int result = userDao.userSignup(user.getU_ID(), user.getU_name(), user.getU_password(), user.getU_image(),
//				user.getU_score(), user.getU_tele(), user.getU_email(), user.getU_birthday(), user.getU_signature());
//		return result == 1 ? true : false;
		 return true;
	}
	
	
	/**
	 * 
	* @Title: isLegal  
	* @Description: 判断输入是否合法  
	* @param @param user
	* @param @return 
	* @return boolean 
	* @throws
	 */
	public boolean isLegal(User user) {
		if (validateName(user.getU_name()) && validatePassword(user.getU_password())
				&& validateTele(user.getU_tele())) {
			return true;
		}
		return false;
	}

	// @desc 赋予用户ID
	// @依然存在问题

	private static int sequence = 0;

	private static int length = 8;

	public static synchronized String genID() {
		
		sequence = sequence >= 99999999 ? 1 : sequence + 1; 
		String index = Integer.toString(sequence);
		int old = index.length();
		if (length > old) {
			char[] c = new char[length];
			char[] x = index.toCharArray();
			int lim = c.length - x.length;
			for (int i = 0; i < lim; i++) {
				c[i] = '0';
			}
			System.arraycopy(x, 0, c, lim, x.length);
			return "yk" + new String(c);
		}
		return "yk" + index.substring(0, length);
	}

	/**
	 * 
	 * @Title: validateName @Description: 验证name @param @param
	 * name @param @return @return boolean @throws
	 */
	public boolean validateName(String name) {
		// 只含有汉字、数字、字母、下划线，下划线位置不限
		String regex = "^[a-zA-Z0-9_\\u4e00-\\u9fa5]+$";
		if (name.length() >= 5 && name.length() <= 100) {
			if (name.matches(regex)) {
				return true;
			}
		}
		return false;
	}

	public boolean validateEmail(String email) {
		String regex = "^[/w-]+(/.[/w-]+)*@[/w-]+(/.[/w-]+)+$";
		if (email.matches(regex)) {
			return true;
		}
		return false;
	}

	public boolean validatePassword(String password) {
		String regex = "^[0-9a-zA-Z_]{1,}$";
		if (password.length() >= 5 && password.length() <= 100) {
			if (password.matches(regex)) {
				return true;
			}
		}
		return false;
	}

	public boolean validateTele(String tele) {
		String regex = "^1([358][0-9]|4[579]|66|7[0135678]|9[89])[0-9]{8}$";
		if (tele.matches(regex)) {
			return true;
		}
		return false;
	}

}
