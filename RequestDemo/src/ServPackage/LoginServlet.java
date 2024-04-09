package ServPackage;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();	
		
		//get parameter() to get the parameter values 
		
		String id=request.getParameter("ID");
		String pass=request.getParameter("password");
		String Username=request.getParameter("Username");
		//String name="Abhishek Singh";
		
		UserRegisterDao ud=new UserRegisterDao();
		RegisterBeanClass user=ud.checklogin(id, pass);
		System.out.println(user.getUsername());
		
		if(user!=null)
		{	
			request.setAttribute("uname", Username);// Username kyun nhi le raha 
		    request.setAttribute("id", id);
		    if(user.getUsername().equals("Admin"))
		    {
		    	System.out.println("ID and pass are correct");
		    	RequestDispatcher rd=request.getRequestDispatcher("AdminProfile.jsp");
			    rd.forward(request, response);
		    }
		    else 
		   {
			System.out.println("ID and pass matched");
			RequestDispatcher rd=request.getRequestDispatcher("Profile.jsp");
		    rd.forward(request, response);
		
		    }
		}
		else
		{
			pw.print("<h1>Either id or pass is incorrect</h1>");
		
			RequestDispatcher rd=request.getRequestDispatcher("LoginPage.jsp");
		     rd.include(request, response);
		
		}
		
	}

}
