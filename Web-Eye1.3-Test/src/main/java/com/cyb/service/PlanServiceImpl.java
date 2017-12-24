package com.cyb.service;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cyb.dao.PlanDaoImpl;
import com.cyb.po.Plan;
import com.cyb.utils.HttpRequest;
/**
 *作者 : iechenyb<br>
 *类描述: 说点啥<br>
 *创建时间: 2017年12月15日
 */
@Service
public class PlanServiceImpl {
	Log log = LogFactory.getLog(PlanServiceImpl.class);
	
	@Autowired
	PlanDaoImpl dao;
	
	
	public void savePlan(String url){
		url = "http://www.28ma.net/index.php?get=neirong&username=17NS1246227907&type=houerdanshi&time=";
		Map<String,StringBuffer> jhs = HttpRequest.sendGetJh(url, null);
		Iterator<String> keys = jhs.keySet().iterator();
		while(keys.hasNext()){
			Plan p = new Plan();
			p.setJhlx("x");
			p.setJhbh("y");
			p.setContent(jhs.get(keys.next()).toString());
			dao.save(p);
		}
	}
	
	
}
