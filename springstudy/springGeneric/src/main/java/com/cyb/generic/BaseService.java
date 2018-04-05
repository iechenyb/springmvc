package com.cyb.generic;

import org.springframework.beans.factory.annotation.Autowired;
//不加注解，让子类继承
public class BaseService<T> {
   @Autowired//
   public BaseDao<T> baseDao;
   
   public void add(T t){
	   System.out.println(t+" add... "+baseDao);
	   baseDao.add();
   }
}
