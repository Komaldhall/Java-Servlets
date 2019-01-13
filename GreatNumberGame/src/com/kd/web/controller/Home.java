package com.kd.web.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private int num=0;
	private int rnum=100;
	private String rock="";
	private String result="";
	private int randomNumber;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		rock="";
		session.setAttribute("result", "");
		Random random = new Random(); 
//		if(request.getParameter("rnum")!=null) {
//			rnum=Integer.parseInt(request.getParameter("rnum"));
//			randomNumber = random.nextInt(2*rnum)+1-rnum;
//		}
//		else {
//			randomNumber = random.nextInt(rnum);
//		}
//		
		randomNumber = random.nextInt(rnum);
        session.setAttribute("randomNumber", randomNumber);       
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/View/Index.jsp");
        view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		int num=Integer.parseInt(request.getParameter("num"));
		int rand=(Integer)session.getAttribute("randomNumber");
		if(num<rand) {
			result="Entered number is lower.";
		}
		else if(num>rand) {
			result="Entered number is higher.";
		}
		else {
			result="Yipee!! Entered number matched.";
			rock+="yes";
		}
		session.setAttribute("result", result);
		session.setAttribute("rock", rock);
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/View/Index.jsp");
	    view.forward(request, response);
	}

}
