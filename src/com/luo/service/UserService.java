package com.luo.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.luo.bean.User;
import com.luo.dao.UserDao;

@Component(value="us")
public class UserService {
	
	private UserDao ud;
	
	public UserDao getUd() {
		return ud;
	}

	@Resource(name="ud")
	public void setUd(UserDao ud) {
		this.ud = ud;
	}
	
	@Transactional
	public void save(User user) {
		ud.save(user);
	}
}
