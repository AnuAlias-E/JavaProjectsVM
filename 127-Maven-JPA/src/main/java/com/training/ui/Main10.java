package com.training.ui;

import java.util.Iterator;
import java.util.List;

import com.training.model.Course;
import com.training.model.Subject;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class Main10 {
	public static void main(String[] args) {
		// insert();
		read();
		update();
		read();
	}

	private static void insert() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		Course course = new Course("Diploma in Web technologies", 40000.0);
		Subject subject1 = new Subject("HTML", 40);
		Subject subject2 = new Subject("CSS", 20);
		Subject subject3 = new Subject("Java Script", 50);
		Subject subject4 = new Subject("React", 60);

		course.addSubject(subject1);
		course.addSubject(subject2);
		course.addSubject(subject3);
		course.addSubject(subject4);

		em.getTransaction().begin();
		em.persist(course);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}

	public static void read() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();
		Course course = em.find(Course.class, 1);

		System.out.println(course);

		em.close();
		emf.close();
	}

	public static void update() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		Course course = em.find(Course.class, 1);

		course.addSubject(new Subject("Angular", 30));

		Iterator<Subject> iterator = course.getSubjects().iterator();
		while (iterator.hasNext()) {
			Subject subject = iterator.next();
			if (subject.getSubjectName().equals("CSS")) {
				iterator.remove();
			}
		}
		em.merge(course);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}

	public static void readAll() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		String str = "from Course";
		Query query = em.createQuery(str, Course.class);

		List<Course> resultSet = query.getResultList();
		System.out.println(resultSet);

		em.close();
		emf.close();
	}

	public static void delete() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		Course course = em.find(Course.class, 3);

		em.getTransaction().begin();
		em.remove(course);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}

}
