package ServPackage;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdminProServ
 */
@WebServlet("/AdminProServ")
public class AdminProServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminProServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action =request.getParameter("action");
		String ID =request.getParameter("ID");
		
		UserRegisterDao ud=new UserRegisterDao();
		
		if(action.equals("Search"))
		{
		RegisterBeanClass user	=ud.Search(ID);
		 if (!(user==null))
		 {
		request.setAttribute("ID", user.getId());
		request.setAttribute("Password", user.getPassword());
		request.setAttribute("Username", user.getUsername());
		request.setAttribute("Email", user.getEmail());
		request.setAttribute("Age", user.getAge()); 
		
		RequestDispatcher rd=request.getRequestDispatcher("ViewRecord.jsp");
			rd.include(request, response);
		 }	
		 else {
			 

				RequestDispatcher rd=request.getRequestDispatcher("AdminProfile.jsp");
					rd.include(request, response);
			 
		 }
			
		}
		else if(action.equals("delete"))
		{
			
			
			ud.Delete(ID);
			System.out.println("Record deleted");
			
			
		}
		else if (action.equals("Update1"))
		{
			RegisterBeanClass user	=ud.Search(ID);
			 if (!(user==null))
			 {
			request.setAttribute("ID", user.getId());
			request.setAttribute("Password", user.getPassword());
			request.setAttribute("Username", user.getUsername());
			request.setAttribute("Email", user.getEmail());
			request.setAttribute("Age", user.getAge()); 
			
			RequestDispatcher rd=request.getRequestDispatcher("UpdateUser.jsp");
				rd.include(request, response);
			 }	
			 else {
				 

					RequestDispatcher rd=request.getRequestDispatcher("AdminProfile.jsp");
						rd.include(request, response);
				 
			 }
			
		}
		
	}

}
