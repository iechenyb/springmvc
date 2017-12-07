package com.cyb.test.user;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.cyb.test.base.SpringJunitBase;
import com.cyb.xtgl.dao.UserDaoImpl;
import com.cyb.xtgl.po.User;

public class UserTest extends SpringJunitBase {
	@Autowired
	UserDaoImpl userDao;

	@Test
	public void addUser() {
		userDao.save(new User("iechenyb", "1234"));
	}
}
