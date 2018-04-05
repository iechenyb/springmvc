package com.cyb.Lisener;

import javax.servlet.ServletContext;

import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;

public class MyContextLoaderContext extends ContextLoaderListener{

	@Override
	protected WebApplicationContext createWebApplicationContext(ServletContext sc) {
		return super.createWebApplicationContext(sc);
	}
	

}
