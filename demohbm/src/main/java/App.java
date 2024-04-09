
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.files.entities.Student;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	System.out.println( "Hello World!" );
    
    Configuration config =new Configuration();
    config.configure("hibernate.cfg.xml");
    
    SessionFactory Factory=config.buildSessionFactory();
    
    Session session = Factory.openSession();
    
    Transaction tx = session.beginTransaction();
    
    Student st1=new Student();
    Scanner sc =new Scanner(System.in);
    
    System.out.println("Enter roll no: ");
    st1.setRollno(sc.nextInt());
    
    System.out.println("Enter name :");
    sc.nextLine();
    st1.setName(sc.nextLine());
    
    System.out.println("Enter course :");
    st1.setCourse(sc.nextLine());
    
    session.save(st1);
    tx.commit();
    
  Factory.close();
  
    
    
    
    }
    
    
}
