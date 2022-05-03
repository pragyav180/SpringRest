package com.luv2code.student.demo;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
//import org.hibernate.mapping.List;



import com.luv2code.hibernate.demo.entity.Student;





public class QueryStudentObject {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				                 .configure("hibernate.cfg.xml")
				                 .addAnnotatedClass(Student.class)
				                 .buildSessionFactory();
//Session session = factory.getCurrentSession();
Session session = factory.getCurrentSession();
		try {
			
			session.beginTransaction();
		
			List<Student> theStudent = session.createQuery("from Student").getResultList();
			
			displayListStudent(theStudent);
			
			
			System.out.println("Printing all students with last name dunne");
			
			List<Student> newStudent = session.createQuery("from Student s where s.lastName = 'Dunne'").getResultList();
			
			displayListStudent(newStudent);
			
			System.out.println("Printing all students with last name dunne and first name as Nck");
			
             List<Student> objStudent = session.createQuery("from Student s where s.lastName = 'Dunne' and s.firstName = 'Nick'").getResultList();
			
			displayListStudent(objStudent);
			
			
			session.getTransaction().commit();
			
		}
		
		finally {
			
			factory.close();
			
		}
		
		
	
	}

	private static void displayListStudent(List<Student> theStudent) {
		for(Student tempStudent : theStudent)
		{
			System.out.println(tempStudent);
		}
	}

}

