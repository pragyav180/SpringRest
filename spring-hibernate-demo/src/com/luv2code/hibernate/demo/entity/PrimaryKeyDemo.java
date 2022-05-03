package com.luv2code.hibernate.demo.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PrimaryKeyDemo {
	
	
public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				                 .configure("hibernate.cfg.xml")
				                 .addAnnotatedClass(Student.class)
				                 .buildSessionFactory();
//Session session = factory.getCurrentSession();
Session session1 = factory.getCurrentSession();
		try {
			
			System.out.println("inserting into student table");
			
			Student tempStudent = new Student("Nick", "Dunne", "Nick@coder.com","9345","Britain");
			Student tempStudent1 = new Student("Amy", "watson", "Amy@coder.com","80058","Vainguard-Lko");
			Student tempStudent2 = new Student("Rach", "Green", "green@coder.com","904","Paris");
			Student tempStudent3 = new Student("Sushi", "Ramada", "Sushi@coder.com","908976","Lko");
			Student tempStudent4 = new Student("Rehana", "Amira", "Rehana@coder.com","9024976","India-Lko");
			//Student tempStudent1 = new Student("9044976602","India");
			session1.beginTransaction();
			
			//session.save(tempStudent);
			session1.save(tempStudent);
			session1.save(tempStudent1);
			session1.save(tempStudent2);
			session1.save(tempStudent3);
			session1.save(tempStudent4);
			
			//session.getTransaction().commit();
			session1.getTransaction().commit();
			
		}
		
		finally {
			
			factory.close();
			
		}
		
		
	
}
}
