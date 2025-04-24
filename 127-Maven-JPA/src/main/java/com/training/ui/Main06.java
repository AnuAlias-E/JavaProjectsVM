package com.training.ui;

import java.util.List;

import com.training.model.Book;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class Main06 {
	public static void insert() {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();
		Book book = new Book(".Net", "Matz George");
		book.addTopics("OOPs");
		book.addTopics("Data Structures");

		em.getTransaction().begin();
		em.persist(book);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}

	public static void read() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		Book book = em.find(Book.class, 1);

		System.out.println(book);

		em.close();
		emf.close();
	}

	public static void update() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		Book book = em.find(Book.class, 1);
		book.addTopics("Collection API");
		book.setAuthorName("Renju PV");
		em.merge(book);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}

	public static void readAll() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		String str = "from Book";
		Query query = em.createQuery(str, Book.class);

		List<Book> resultSet = query.getResultList();
		System.out.println(resultSet);

		em.close();
		emf.close();
	}

	public static void delete() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		Book book = em.find(Book.class, 1);

		em.getTransaction().begin();
		em.remove(book);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}

	public static void main(String[] args) {
		insert();

		// read();
		// update();
		// read();
		readAll();
		delete();
		readAll();
	}
}
