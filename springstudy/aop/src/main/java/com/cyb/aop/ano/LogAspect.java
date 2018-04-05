package com.cyb.aop.ano;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Order(2)
@Component
@Aspect
public class LogAspect {
	
	@Pointcut(value="execution(public int com.cyb.aop.BaseDaoImpl.*(int,int))")
	public void declareJoinPointExression(){};
	
	@Before(value="declareJoinPointExression()")//复用切面配置
	//@Before(value="execution(public int com.cyb.aop.BaseDaoImpl.*(int,int))")
	public void beforeMethod(JoinPoint jp){
		
		System.out.println("Before "+getMethodInfor(jp));
	}
	
	@After(value="execution(public int com.cyb.aop.BaseDaoImpl.*(int,int))")
	public void afterMethod(JoinPoint jp){
		System.out.println("After "+getMethodInfor(jp));
	}
	
	@AfterReturning(value="execution(public int com.cyb.aop.BaseDaoImpl.*(int,int))")
	public void returnMethod(JoinPoint jp){
		System.out.println("AfterReturning "+getMethodInfor(jp));
	}

	@AfterThrowing(value="execution(public int com.cyb.aop.BaseDaoImpl.*(int,int))",throwing="e")
	public void returnThrowing(JoinPoint jp,Exception e){
		System.out.println("ReturnThrowing "+getMethodInfor(jp)+",exception = "+e.toString());
	}
	
	/*@Around(value="execution(public int com.cyb.aop.BaseDaoImpl.*(int,int))")
	public Object around(ProceedingJoinPoint pjp){
		Object obj = null;
		System.out.println("before "+getMethodInfor(pjp));
		try {
			obj = pjp.proceed();
		} catch (Throwable e) {
			System.out.println(getMethodInfor(pjp)+" 出现异常！"+e);
			throw new RuntimeException(e);
		}
		System.out.println("after "+getMethodInfor(pjp));
		return obj;
	}*/
	
	public String getMethodInfor(JoinPoint jp){
		String method = jp.getSignature().getName();
		List<Object> args = Arrays.asList(jp.getArgs());
		return new Date().toString()+" "+jp.getTarget()+"."+method+args;
	}
}
