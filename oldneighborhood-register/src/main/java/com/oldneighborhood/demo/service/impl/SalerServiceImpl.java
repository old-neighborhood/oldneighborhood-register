package com.oldneighborhood.demo.service.impl;

import java.util.UUID;

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
		
		LegalCheckImpl lci = new LegalCheckImpl();
		if (!lci.isSalerLegal(saler)) {
			System.out.println("注册字符不合法");
			return false;
		}
		saler.setS_ID(UUID.randomUUID().toString().replace("-", ""));
		Saler getsaler = salerDao.saveAndFlush(saler);
		System.out.println(getsaler.getS_ID());
		return true;
	}
	

	
//	// @desc 赋予用户ID
//	// @依然存在问题
//	private static int sequence = 0;
//
//	private static int length = 8;
//
//	public static synchronized String genID() {
//		
//		sequence = sequence >= 99999999 ? 1 : sequence + 1; 
//		String index = Integer.toString(sequence);
//		int old = index.length();
//		if (length > old) {
//			char[] c = new char[length];
//			char[] x = index.toCharArray();
//			int lim = c.length - x.length;
//			for (int i = 0; i < lim; i++) {
//				c[i] = '0';
//			}
//			System.arraycopy(x, 0, c, lim, x.length);
//			return "sh" + new String(c);
//		}
//		return "sh" + index.substring(0, length);
//	}


}
