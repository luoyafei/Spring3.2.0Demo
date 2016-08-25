package com.luo.dao.impl;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.luo.bean.User;
import com.luo.dao.UserDao;

@Component(value="ud")
public class UserDaoImpl implements UserDao {

	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	@Resource(name="hibernateTemplate")
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public void save(User user) {
		hibernateTemplate.save(user);
	}
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void getUserAll() {
		List<User> users = (List<User>)hibernateTemplate.executeFind(new HibernateCallback() {
			@Override
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				String query = "from User u where u.id = :userId order by :userIdD desc";
				List<User> users = (List<User>)session.createQuery(query).setParameter("userId", 10).setParameter("userIdD", "id").list();
				return users;
			}
		});
		System.out.println(users.size());
	}
}
