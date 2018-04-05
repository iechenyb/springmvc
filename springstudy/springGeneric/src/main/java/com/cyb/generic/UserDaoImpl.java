package com.cyb.generic;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements BaseDao<User>{

	public void add() {
		System.out.println("userdaoimpl execute...");
	}

}
