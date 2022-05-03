package com.luv2code.student.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.luv2code.hibernate.demo.entity.Student;



public class DeleteStudentDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				                 .configure("hibernate.cfg.xml")
				                 .addAnnotatedClass(Student.class)
				                 .buildSessionFactory();
//Session session = factory.getCurrentSession();
Session session1 = factory.getCurrentSession();
		try {
			 
			int studentId = 2;
			session1.beginTransaction();
	        System.out.println("Printing student outpt:" +studentId);
			//Student myStudent = session1.get(Student.class,studentId);
			//session1.delete(myStudent);
	        session1.createQuery("delete from Student where id = 2").executeUpdate();
			System.out.println("Row with studentId 2 is deleted");
			
			session1.getTransaction().commit();
		}
              finally {
			
			     factory.close();
			
		              }
		
		
		
		
		
		
	
	}

}
