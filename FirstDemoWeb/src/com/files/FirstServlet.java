package com.files;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/serv1")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// getparameter() : it is used to get the values from the request url
		
		String uid=request.getParameter("uid");
		String pass=request.getParameter("upass");
		
		// set response content type
		response.setContentType("text/html");
		
		// get writer from response
		PrintWriter out=response.getWriter();
		
		if(uid.equals("user101")&&pass.equals("12345"))
{
	//out.print("<h1>Login Successfull</h1>");
	RequestDispatcher rd=request.getRequestDispatcher("ProfilePage.jsp");
	rd.forward(request, response);
}
else 
{
	out.print("<h1>Either Login or Pass is incorrect</h1>");
	RequestDispatcher rd=request.getRequestDispatcher("index.html");
	rd.include(request, response);
}
		out.close();
	}

}
