package com.OnlineCalci;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SubtractionServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException {
	 	int n1=Integer.parseInt(req.getParameter("num1")); //we take input as number hence int //getparameter takes string has input hence convert to string using Integer.parseInt
	 	int n2=Integer.parseInt(req.getParameter("num2"));
	 	int res=n1-n2;
	 	PrintWriter out=resp.getWriter();
		out.print("The Subtraction of "+n1+" and "+n2+" is "+res);


}
}
