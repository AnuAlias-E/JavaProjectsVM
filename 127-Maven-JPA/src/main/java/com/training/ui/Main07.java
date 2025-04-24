package com.training.ui;

import java.util.List;

import com.training.model.Category;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class Main07 {

	public static void insert() {

		Category category = new Category("Web Technologies");
		category.addTechnologyNames("HTML");
		category.addTechnologyNames("CSS");
		category.addTechnologyNames("JS");
		category.addTechnologyNames("React");
		category.addTechnologyNames("Angular");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		em.persist(category);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}

	public static void read() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		Category category = em.find(Category.class, 1);

		System.out.println(category);

		em.close();
		emf.close();
	}

	public static void update() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		Category category = em.find(Category.class, 1);
		category.removeTechnologyNames("React");
		category.addTechnologyNames("BootStrap");
		em.merge(category);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}

	public static void readAll() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		String str = "from Category";
		Query query = em.createQuery(str, Category.class);

		List<Category> resultSet = query.getResultList();
		System.out.println(resultSet);

		em.close();
		emf.close();
	}

	public static void delete() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		Category category = em.find(Category.class, 2);

		em.getTransaction().begin();
		em.remove(category);
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
		// delete();
		// readAll();
	}

}
