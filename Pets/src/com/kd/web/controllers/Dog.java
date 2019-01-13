package com.kd.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kd.web.models.Dogs;

/**
 * Servlet implementation class Dog
 */
@WebServlet("/Dog")
public class Dog extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Dog() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String dname = request.getParameter("dname");
		String dbreed = request.getParameter("dbreed");
//		int dweight=0;
		int dweight = Integer.parseInt(request.getParameter("dweight"));
		
		
		Dogs dog=new Dogs(dname,dbreed,dweight);
		
		request.setAttribute("dog",dog);
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/View/Dogs.jsp");
        view.forward(request, response);
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
