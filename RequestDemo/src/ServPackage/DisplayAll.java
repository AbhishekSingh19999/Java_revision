package ServPackage;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DisplayAll
 */
@WebServlet("/DisplayAll")
public class DisplayAll extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayAll() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int pg=Integer.parseInt(request.getParameter("Page"));
		int total=5;
		
		if(pg==1)
		{
			pg--;
		}
		else 
		{
			pg=(pg-1)*total;
		}
		
		
		UserRegisterDao dao=new UserRegisterDao();
		//dao.getRecords(pg, total);
		List<RegisterBeanClass>  records = dao.getRecords(pg, total);
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		
		pw.print("<table width = '100%' border ='3'>");
		
		pw.print("<tr>");
		pw.print("<th>ID</th>");
		pw.print("<th>Password</th>");
		pw.print("<th>Username</th>");
		pw.print("<th>Email</th>");
		pw.print("<th>Age</th>");
		pw.print("</tr>");
		
		for(RegisterBeanClass u:records)
		{	
			pw.print("<tr>");
		pw.print("<td>"+u.getID()+"</td>");
		pw.print("<td>"+u.getPassword()+"</td>");
		pw.print("<td>"+u.getUsername()+"</td>");
		pw.print("<td>"+u.getEmail()+"</td>");
		pw.print("<td>"+u.getAge()+"</td>");
		pw.print("</tr>");
			
			
			
		}
		
		
		pw.print("<a href = 'DisplayAll?Page=1'>page 1</a> | ");
		pw.print("<a href = 'DisplayAll?Page=2'>page 2</a> | ");
		
	}

}
