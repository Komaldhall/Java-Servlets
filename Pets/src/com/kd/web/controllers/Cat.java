package com.kd.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kd.web.models.Cats;

/**
 * Servlet implementation class Cat
 */
@WebServlet("/Cat")
public class Cat extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cat() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String cname = request.getParameter("cname");
		String cbreed = request.getParameter("cbreed");
//		int cweight=0;

		int cweight = Integer.parseInt(request.getParameter("cweight"));
		
		Cats cat=new Cats(cname,cbreed,cweight);
		request.setAttribute("cat",cat);
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/View/Cats.jsp");
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
