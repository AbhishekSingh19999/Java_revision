package com.files;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.files.entities.Student;

import java.util.List;

import org.hibernate.Session;
public class App1 {

	public static void main(String[] args) {
		
		
		Configuration config=new Configuration();
		
		config.configure("hibernate.cfg.xml");
		
		SessionFactory factory= config.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction tx=session.beginTransaction();
		
		Query q=session.createQuery("from Student");
		
		
	List<Student> list	=q.list();
		
		
		
		

	}

}
