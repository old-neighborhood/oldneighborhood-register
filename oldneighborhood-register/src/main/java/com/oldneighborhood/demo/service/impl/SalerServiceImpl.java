package com.oldneighborhood.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oldneighborhood.demo.dao.SalerDao;
import com.oldneighborhood.demo.entity.Saler;
import com.oldneighborhood.demo.service.SalerService;

@Service
public class SalerServiceImpl implements SalerService{
	@Autowired
	private SalerDao salerDao;
	
	@Override
	@Transactional
	public boolean salerSignup(Saler saler) {
		if (!isLegal(saler)) {
			return false;
		}
		saler.setS_ID(genID());
		
		salerDao.save(saler);
		System.out.println(saler.getS_ID());
		return true;
	}
	
	public boolean isLegal(Saler saler) {
		if (validateName(saler.getS_name()) && validatePassword(saler.getS_password())
				&& validateTele(saler.getS_tele())) {
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
			return "sh" + new String(c);
		}
		return "sh" + index.substring(0, length);
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
