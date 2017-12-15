package com.cyb.service;
import javax.transaction.Transactional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cyb.dao.MyUserRepository;
import com.cyb.dao.NetResultDaoImpl;
import com.cyb.dao.NetResultRepository;
import com.cyb.net.UrlTask;
import com.cyb.po.MyUser;
import com.cyb.po.NetResult;
/**
 *作者 : iechenyb<br>
 *类描述: 说点啥<br>
 *创建时间: 2017年12月15日
 */
@Service
public class NetServiceImpl {
	Log log = LogFactory.getLog(NetServiceImpl.class);
	
	@Autowired
	UrlTask urlTask;
	
	@Autowired
	NetResultRepository rep;
	
	@Autowired
	MyUserRepository myuserrep;
	
	@Autowired
	NetResultDaoImpl dao;
	
	
	public void saveUrlTest(String url){
		NetResult nr = urlTask.execute(url);
		/*rep.save(nr);
		dao.save(nr);*/
		MyUser user = new MyUser();
		user.setPassword("1");
		user.setUsername("sf");
		myuserrep.save(user);
		
	}
}
