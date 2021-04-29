package com.practice.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.practice.hibernate.demo.entity.Student;

public class UpdateStudentDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();

		try {

			int studentId = 1;

			// now get a new Session and start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();

			// retrieve the student based on id:primary key
			System.out.println("\n Getting started with id: " + studentId);

			Student myStudent = session.get(Student.class, studentId);

			System.out.println("Updating Student");
			myStudent.setFirstName("Scooby");

			// commit the transaction
			session.getTransaction().commit();

			/* new code */
			session = factory.getCurrentSession();
			session.beginTransaction();

			// update email for all students
			System.out.println("Update email for all students");
			session.createQuery("update Student set email='foo@gmail.com'").executeUpdate();

			session.getTransaction().commit();

			System.out.println("Work done!");

		} finally {
			factory.close();
		}

	}

}
