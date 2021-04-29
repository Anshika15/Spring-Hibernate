package com.practice.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.practice.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();

		try {

			// start a transaction
			session.beginTransaction();

			// query students
			List<Student> theStudents = session.createQuery("from Student").list();

			// display students
			displayStudents(theStudents);

			// query Students lastName:'Doe'
			theStudents = session.createQuery("from Student s where s.lastName='Doe'").list();

			// display the Students
			System.out.println("\n\nStudents with last name of Doe");
			displayStudents(theStudents);

			// commit transaction
			session.getTransaction().commit();

			System.out.println("Work done!");

		} finally {
			factory.close();
		}

	}

	private static void displayStudents(List<Student> theStudents) {
		for (Student tempStudent : theStudents) {
			System.out.println(tempStudent);
		}
	}

}
