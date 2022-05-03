package com.luv2code.student.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.luv2code.hibernate.demo.entity.Student;



public class ReadingStudentDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				                 .configure("hibernate.cfg.xml")
				                 .addAnnotatedClass(Student.class)
				                 .buildSessionFactory();
//Session session = factory.getCurrentSession();
Session session1 = factory.getCurrentSession();
		try {
			
			System.out.println("inserting into student table");
			
			Student tempStudent = new Student("Adie", "Raghav", "Adie@coder.com","9044976","India-Lko");
			
			//Student tempStudent1 = new Student("9044976602","India");
			session1.beginTransaction();
			
			//session.save(tempStudent);
			session1.save(tempStudent);
			System.out.println(tempStudent);
			System.out.println("Printing student outpt:" +tempStudent.getId());
			
			//session.getTransaction().commit();
			session1.getTransaction().commit();
			session1 = factory.getCurrentSession();
		System.out.println("session retrieved");
		session1.beginTransaction();
		System.out.println("beginning Transaction");
		Student myStudent = session1.get(Student.class,tempStudent.getId());
		System.out.println("getting student output");
		
		System.out.println("Printing student outpt:" +myStudent.getId());
		
		session1.getTransaction().commit();
		}
              finally {
			
			     factory.close();
			
		              }
		
		
		
		
		
		
	
	}

}
