package com.cyb.ioc;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class User implements BeanNameAware,InitializingBean,DisposableBean{
   String name ;
   
   public User(){
	   System.out.println("new Bean默认的构造方法");
   }
   
   public void setName(String name) {
	   System.out.println("Bean.setName 自定义Bean设置属性值");
	   this.name = name;
   }
   
   public void showName(){
	   System.out.println("**********************************");
	   System.out.println("*****程序调用属性值：显示名称 "+name+"******");
	   System.out.println("**********************************");
   }
   
   public void myInit(){
	   System.out.println("init-method 自定义初始化方法");
   }
   
   public void myDestroy(){
	   System.out.println("destroy-method 自定义销毁方法");
   }

	public void setBeanName(String arg0) {
		System.out.println("BeanNameAware.setBeanName  "+arg0);
	}
	
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean.afterPropertiesSet 容器调用");
	}

	public void destroy() throws Exception {
		  System.out.println("DisposableBean.destroy 容器的销毁方法");
	}

}
