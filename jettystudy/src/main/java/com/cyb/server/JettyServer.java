package com.cyb.server;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

import com.cyb.servlet.LoginServlet;
/**
 *作者 : iechenyb<br>
 *类描述: 说点啥<br>
 *http://localhost:8080/here?username=121
 *创建时间: 2018年1月9日
 */
public class JettyServer {
	Log log = LogFactory.getLog(JettyServer.class);
	 public static void main(String[] args) throws Exception {
         Server server= new Server(8080);
         ServletContextHandler context= new ServletContextHandler(ServletContextHandler.SESSIONS );
          context.setContextPath( "/");
          server.setHandler( context);
          context.addServlet( new ServletHolder( new LoginServlet()),"/here");
          server.start();
          server.join();
   }
}
