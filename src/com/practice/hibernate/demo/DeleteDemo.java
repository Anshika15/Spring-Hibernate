package com.practice.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.practice.hibernate.demo.entity.Instructor;
import com.practice.hibernate.demo.entity.InstructorDetail;
import com.practice.hibernate.demo.entity.Student;

public class DeleteDemo {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();

		try {

			// start a transaction
			session.beginTransaction();

			// get instructor by primary key / id
			int theId = 1;
			Instructor tempInstructor = session.get(Instructor.class, theId);

			System.out.println("Found Instructor: " + tempInstructor);

			// delete the instructors
			if (tempInstructor != null) {
				System.out.println("Deleting: " + tempInstructor);

				// Note: will ALSO DELETE associated "details" object
				session.delete(tempInstructor);
			}

			// commit transaction
			session.getTransaction().commit();
			System.out.println("Work done!");

		} finally {
			factory.close();
		}

	}

}
