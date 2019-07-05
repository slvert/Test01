package com.jswl.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jswl.demo.bean.UserBean;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * Servlet implementation class JsonServlet
 */
@WebServlet("/json.do")
public class JsonServlet extends HttpServlet {
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserBean ub=new UserBean();
		/*
		 * ub.setId(1); ub.setName("阿良"); ub.setSex("male"); ub.setAge(18);
		 * //将javabean对象转换成json格式 JSONObject jo = JSONObject.fromObject(ub);
		 * System.out.println(jo);
		 */
		ub.setId(10);
		ub.setAge(22);
		ub.setName("la");
		ub.setSex("male");
		UserBean ub1=new UserBean();
		ub1.setId(11);
		ub1.setAge(23);
		ub1.setName("yiyi");
		ub1.setSex("female");
		List<UserBean> users=new ArrayList<UserBean>();
		users.add(ub);
		users.add(ub1);
		JSONArray ja = JSONArray.fromObject(users);
		System.out.println(ja);
		//设置编码格式
		response.setCharacterEncoding("utf-8");
		//获取响应流对象
		PrintWriter writer = response.getWriter();
		writer.print(ja.toString());
		//writer.write(jo.toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
