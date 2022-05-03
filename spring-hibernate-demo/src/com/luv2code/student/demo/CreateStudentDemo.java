package com.luv2code.student.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.luv2code.hibernate.demo.entity.Student;



public class CreateStudentDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				                 .configure("hibernate.cfg.xml")
				                 .addAnnotatedClass(Student.class)
				                 .buildSessionFactory();
//Session session = factory.getCurrentSession();
Session session1 = factory.getCurrentSession();
		try {
			
			System.out.println("inserting into student table");
			
			Student tempStudent = new Student("jia", "Kapoor", "Jiaa@coder.com","9044976","India-Lko");
			
			//Student tempStudent1 = new Student("9044976602","India");
			session1.beginTransaction();
			
			//session.save(tempStudent);
			session1.save(tempStudent);
			
			//session.getTransaction().commit();
			session1.getTransaction().commit();
			
		}
		
		finally {
			
			factory.close();
			
		}
		
		
	
	}

}
