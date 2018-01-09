package com.cyb.servlet;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 作者 : iechenyb<br>
 * 类描述: 说点啥<br>
 * 创建时间: 2018年1月9日
 */
public class LoginServlet extends HttpServlet {
	Log log = LogFactory.getLog(LoginServlet.class);

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		response.setContentType("text/html;charset=utf-8");

		// 返回html 页面
		response.getWriter().println("<html>");
		response.getWriter().println("<head>");
		response.getWriter().println("<title>登录信息</title>");
		response.getWriter().println("</head>");
		response.getWriter().println("<body>");
		response.getWriter().println("欢迎【" + username + "】用户登录成功！！！");
		response.getWriter().println("</body>");
		response.getWriter().println("</html>");

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// doGet(request,response);
		response.sendRedirect("/web-inf/jsp/default.jsp");
	}
}
