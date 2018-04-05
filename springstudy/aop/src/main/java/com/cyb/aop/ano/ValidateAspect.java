package com.cyb.aop.ano;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Order(1)
@Component
@Aspect
public class ValidateAspect {
	//@Before(value="execution(public int com.cyb.aop.BaseDaoImpl.*(int,int))")
	@Before(value="com.cyb.aop.ano.LogAspect.declareJoinPointExression()")//使用公共的切入点
	public void beforeMethod(JoinPoint jp){
		
		System.out.println("--->validate "+getMethodInfor(jp));
	}

	public String getMethodInfor(JoinPoint jp){
		String method = jp.getSignature().getName();
		List<Object> args = Arrays.asList(jp.getArgs());
		return new Date().toString()+" "+jp.getTarget()+"."+method+args;
	}
}
