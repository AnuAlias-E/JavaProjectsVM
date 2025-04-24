package com.training.ui;

import java.util.List;

import com.training.model.Question;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class Main04 {

	public static void insert() {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		String[] choices = { "true", "false" };
		Question question1 = new Question("Have constructor return type?", 2, choices);
		Question question2 = new Question("Is== operater is used to compare two strings?", 5, choices);
		Question question3 = new Question("Is every class inherits object class?", 2, choices);

		em.getTransaction().begin();
		em.persist(question3);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}

	public static void read() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		Question question = em.find(Question.class, 7);

		System.out.println(question);

		em.close();
		emf.close();
	}

	public static void update() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		Question question = em.find(Question.class, 1);

		question.setMark(10);
		em.merge(question);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}

	public static void readAll() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		String str = "from Question";
		Query query = em.createQuery(str, Question.class);

		List<Question> resultSet = query.getResultList();
		System.out.println(resultSet);

		em.close();
		emf.close();
	}

	public static void delete() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		Question question = em.find(Question.class, 7);

		em.getTransaction().begin();
		em.remove(question);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}

	public static void main(String[] args) {
		// insert();

		// read();
		// update();
		// read();
		// delete();
		readAll();
	}
}
