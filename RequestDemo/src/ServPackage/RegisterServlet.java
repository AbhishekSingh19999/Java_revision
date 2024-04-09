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
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		
		//get parameter : to get the parameter value 
		
		RegisterBeanClass ub=new RegisterBeanClass();
		
		ub.setId(request.getParameter("ID"));
		ub.setPassword(request.getParameter("password"));
		ub.setUsername(request.getParameter("Username"));
		ub.setEmail(request.getParameter("Email"));
		ub.setAge(Integer.parseInt(request.getParameter("Age")));
		
		
		UserRegisterDao udao= new UserRegisterDao();
	 int status=	udao.insertRecord(ub);
		
	 if(status ==1)
	 {
		 pw.print("<h1Registratiion Successful</h1>"); // yahan pe registration kyun likh ke nahi aya 
		 RequestDispatcher rd= request.getRequestDispatcher("AfterRegistration.jsp");
		 rd.forward(request, response);
	 }
	 else 
	 {
		 pw.print("<h1Registratiion not Successful</h1>");
		 RequestDispatcher rd= request.getRequestDispatcher("LoginPage.jsp");
		 rd.include(request, response);
	 }
		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
