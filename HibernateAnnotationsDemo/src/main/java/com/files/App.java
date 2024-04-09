package com.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

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
       Configuration config=new Configuration();
       config.configure("hibernate.cfg.xml");
       
       System.out.println("Files configured");
       SessionFactory Factory=config.buildSessionFactory();
       
       Session session = Factory.openSession();
       
       Transaction tx = session.beginTransaction();
   
       Student st1=new Student();
    
    st1.setCourse("c");
    st1.setName("Apoo");
    
    
    try {
		
    	FileInputStream fis=new FileInputStream("C:\\Users\\prati\\Downloads\\pexels-valeria-boltneva-1639556.jpg");
	   byte[] img =fis.readAllBytes();
       st1.setImage(img);
    
    } catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

    Student st2=new Student();
    
  st2.setCourse("javascript");
  st2.setName("Abhi");
  
  try {
		
  	FileInputStream fis=new FileInputStream("C:\\Users\\prati\\Downloads\\pexels-valeria-boltneva-1639556.jpg");
	   byte[] img =fis.readAllBytes();
      st2.setImage(img);
  
  } catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}


   session.save(st1);
   session.save(st2);
    tx.commit();
 Factory.close();
    }
    
    
    
}
