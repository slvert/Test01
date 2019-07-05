package com.jswl.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestAjax
 */
@WebServlet("/getdata.do")
public class TestAjax extends HttpServlet {
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取页面信息
		String loginname = request.getParameter("loginname");
		String password = request.getParameter("password");
		System.out.println("用户名:"+loginname+"密码:"+password);
		try {
			//线程延迟3秒
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/**
		 * 把接收到的数据信息传到数据库查询
		 * 查询到 响应成功的信息
		 */
		response.setCharacterEncoding("utf-8");
		PrintWriter writer = response.getWriter();
		writer.print("ajax执行成功");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
