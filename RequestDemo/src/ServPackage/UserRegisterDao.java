package ServPackage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;



public class UserRegisterDao {
	
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	private String ID;
	
	
	
	
	
	

	public UserRegisterDao()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			System.out.println("Driver Found ");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","12345");
		System.out.println("Connection Created");
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

      public RegisterBeanClass checklogin(String ID,  String Password)
      {
    	  RegisterBeanClass ub=null;
    	  
    	  try
    	  {
    		  
    	  ps=con.prepareStatement("select * from user where id=? and password=? ");
    	  
    	  ps.setString(1, ID );
    	  ps.setString(2, Password);
    	  
    	 rs=ps.executeQuery();
    	 
    	 if(rs.next())
    	 {
    		 ub=new RegisterBeanClass ();
    		 ub.setId(rs.getString(1));
    		 ub.setUsername(rs.getString(3));
    		 ub.setEmail(rs.getString(4));
    		 ub.setAge(rs.getInt(5));
    		 ub.setPassword(rs.getString(2));
    		 
    	 }
    	  
    	  
    	  }catch(SQLException e) {
    		  
    		  e.printStackTrace();
      }
		return ub;

}
	
public int insertRecord(RegisterBeanClass user)
{
	int status=0;
	
	try {
	ps=con.prepareStatement("insert into user values (?,?,?,?,?)");
	
	ps.setString(1, user.getId());
	ps.setString(2, user.getPassword());
	ps.setString(3, user.getUsername());
	ps.setString(4, user.getEmail());
	ps.setInt(5, user.getAge());
	
	
	status= ps.executeUpdate();
	
	}catch(SQLException e) {
		
		e.printStackTrace();
	
}
	return status;

	

}

public RegisterBeanClass Search(String ID)
{
	  RegisterBeanClass ub=null;
	  
	  try
	  {
		  
	  ps=con.prepareStatement("select * from user where id=?");
	  
	  ps.setString(1, ID );
	 // ps.setString(2, Password);
	  
	 rs=ps.executeQuery();
	 
	 if(rs.next())
	 {
		 ub=new RegisterBeanClass ();
		 ub.setId(rs.getString(1));
		 ub.setPassword(rs.getString(2));
		 ub.setUsername(rs.getString(3));
		 ub.setEmail(rs.getString(4));
		 ub.setAge(rs.getInt(5));
		
		 
	 }
	  
	  
	  }catch(SQLException e) {
		  
		  e.printStackTrace();
}
	return ub;

}

  public int  Delete(String ID)
  {
	  int status =0;
	  
	  try
	  {
		  
	  ps=con.prepareStatement("delete from user where id=?");
	  
	  ps.setString(1, ID );
	 // ps.setString(2, Password);
	  
	 status=ps.executeUpdate();
	
	  }catch(SQLException e) {
		  
		  e.printStackTrace();
}
	return status;
}
  
  
  public int  Update(RegisterBeanClass user)
  {
	  int status =0;
	  
	  try
	  {
		  
	  ps=con.prepareStatement("update user set Password =?, Username= ?, Email=?, Age=?  where ID=?");
	  
	  ps.setString(5, user.getId() );
	  ps.setString(1,  user.getPassword());
		ps.setString(2, user.getUsername());
		ps.setString(3, user.getEmail());
		ps.setInt(4, user.getAge());
		
	  
	 status=ps.executeUpdate();
	
	  }catch(SQLException e) {
		  
		  e.printStackTrace();
}
	return status;
}
  public List<RegisterBeanClass> getRecords(int start , int total)
  {
	  List<RegisterBeanClass>   users= new ArrayList<>();
 
	  try
	  {
  
  ps=con.prepareStatement("select * from user limit ?,?");
  ps.setInt(1, start);
  ps.setInt(2, total);
  
  rs=ps.executeQuery();
  
  while(rs.next())
  {
	  RegisterBeanClass ub=  new RegisterBeanClass();
  
	  ub.setId(rs.getString("Id"));
		 ub.setPassword(rs.getString("Password"));
		 ub.setUsername(rs.getString("Username"));
		 ub.setEmail(rs.getString("Email"));
		 ub.setAge(rs.getInt("Age"));
		 
		 users.add(ub);
		 
  }
  
	  }catch(SQLException e) {
		  
		  e.printStackTrace();
	  }
  
	   return users;
  }
  
}