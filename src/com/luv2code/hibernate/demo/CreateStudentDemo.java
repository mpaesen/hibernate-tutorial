package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class CreateStudentDemo {
	public static void main(String [] args) {
		//create session factory
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		//create session
		Session session =
				factory.getCurrentSession();
		
		try {
			//use the session object to java object	
			// create the student object
			System.out.println("Creating a new student object ...");
			Student student = new Student("Paesen", "Ann-Sophie", "apaesen@gmail.com");
			// start the transaction
			session.beginTransaction();
			
			// save the student
			System.out.println("Saving the student object ...");
			session.save(student);
			
			// commit the transaction
			session.getTransaction().commit();
			
			System.out.println("Done");
		}catch(Exception exc) {
			exc.printStackTrace();
		}
	}

}
