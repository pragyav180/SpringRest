package com.luv2code.student.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.luv2code.hibernate.demo.entity.Student;



public class UpdateStudentDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				                 .configure("hibernate.cfg.xml")
				                 .addAnnotatedClass(Student.class)
				                 .buildSessionFactory();
//Session session = factory.getCurrentSession();
Session session1 = factory.getCurrentSession();
		try {
			 
			int studentId = 1;
			session1.beginTransaction();
	        System.out.println("Printing student outpt:" +studentId);
			session1.createQuery("update Student set email = 'whatever.gamil.com'").executeUpdate();
			
			
			
			
			
		
		session1.getTransaction().commit();
		}
              finally {
			
			     factory.close();
			
		              }
		
		
		
		
		
		
	
	}

}
