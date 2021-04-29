package com.practice.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.practice.hibernate.demo.entity.Student;

public class DeleteStudentDemo {

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
			System.out.println("\n Getting student with id: " + studentId);

			Student myStudent = session.get(Student.class, studentId);

			// delete the student
//			System.out.println("Deleting Student: " + myStudent);
//			session.delete(myStudent);

			// delete student id = 2
			System.out.println("Deleting student with id = 2");
			session.createQuery("delete from Student where id=2").executeUpdate();

			// commit the transaction
			session.getTransaction().commit();

			System.out.println("Work done!");

		} finally {
			factory.close();
		}

	}

}
