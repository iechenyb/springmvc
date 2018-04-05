package com.cyb.Lisener;

import javax.servlet.ServletContext;

import org.springframework.web.context.ConfigurableWebApplicationContext;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.support.XmlWebApplicationContext;

public class DontAllowSameBeanContext extends ContextLoader{

	@Override
	protected void customizeContext(ServletContext sc, ConfigurableWebApplicationContext wac) {
		XmlWebApplicationContext ac = (XmlWebApplicationContext)wac;
		ac.setAllowBeanDefinitionOverriding(false);
		super.customizeContext(sc, wac);
	}

}
