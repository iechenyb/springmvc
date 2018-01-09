package com.cyb.server;

import java.util.concurrent.Executors;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.server.nio.SelectChannelConnector;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.eclipse.jetty.util.thread.ExecutorThreadPool;
import org.eclipse.jetty.util.thread.ThreadPool;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * 作者 : iechenyb<br>
 * 类描述: 说点啥<br>
 * http://localhost:8080/here?username=121 创建时间: 2018年1月9日
 */
public class JettyServerMVC {
	Log log = LogFactory.getLog(JettyServerMVC.class);

	public static void main(String[] args) throws Exception {
		Server server = new Server(8080);

		ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
		context.setContextPath("/");

		// 使用spring的Servlet处理
		DispatcherServlet servlet = new DispatcherServlet();
		servlet.setContextConfigLocation("classpath*:spring-jetty.xml");
		context.addServlet(new ServletHolder(servlet), "/");

		HandlerList handlers = new HandlerList();
		handlers.addHandler(context);
		server.setHandler(handlers);

		ThreadPool pool = new ExecutorThreadPool(Executors.newCachedThreadPool());
		server.setThreadPool(pool);

		Connector connector = new SelectChannelConnector();
		connector.setPort(8080); // 此处要与前面设置的 jetty端口一致。
		server.setConnectors(new Connector[] { connector });

		server.start();
		server.join();
	}
}
