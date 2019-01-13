package cd.kd.userinformation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
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
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		// get the value for the query parameter
		String userFName = request.getParameter("firstName");
		String userLName = request.getParameter("lastName");
		
		String language = request.getParameter("language");
		String homeTown = request.getParameter("hometown");
        if (userFName == null) {
        	userFName="Unknown";
        }
        if (userLName == null) {
        	userLName="Unknown";
        }
        if (language == null) {
        	language="Unknown";
        }
        if (homeTown == null) {
        	homeTown="Unknown";
        }
        String userName = userFName+" "+userLName;
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.write("<h1>Welcome, " + userName + "</h1>");
        out.write("<h3>Your favourite language is: " + language + "</h3>");
        out.write("<h3>Your hometown is: " + homeTown + "</h3>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

//try with
//http://localhost:8080/Userinformation/Home?firstName=Komal&lastName=Dhall&language=Punjabi&hometown=Delhi
