package com.practice.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.practice.hibernate.demo.entity.Student;

public class ReadStudentDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();

		try {
			/* use the session object to save java object */

			// create a student object
			System.out.println("Creating new student object");
			Student tempStudent1 = new Student("Daffy", "Duck", "daffy@gmail.com");

			// start a transaction
			session.beginTransaction();

			// save the student object
			System.out.println("saving the student");
			System.out.println(tempStudent1);
			session.save(tempStudent1);

			// commit transaction
			session.getTransaction().commit();

			/* New Code */

			// find out the student's id: primay key
			System.out.println("Saved Student. Generated id: " + tempStudent1.getId());

			// now get a new Session and start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();

			// retrieve the student based on id:primary key
			System.out.println("\n Getting started with id: " + tempStudent1.getId());

			Student myStudent = session.get(Student.class, tempStudent1.getId());

			System.out.println("Get Complete: " + myStudent);

			// commit the transaction
			session.getTransaction().commit();

			System.out.println("Work done!");

		} finally {
			factory.close();
		}

	}

}
