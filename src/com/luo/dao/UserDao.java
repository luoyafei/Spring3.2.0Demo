package com.luo.dao;

import com.luo.bean.User;

public interface UserDao {
	public void save(User user);

	public void getUserAll();
}
