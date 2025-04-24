package com.training.ui;

import java.util.List;

import com.training.model.Candidate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class Main03 {

	public static void insert() {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		// Candidate candidate1 = new Candidate("Ram", "Pune", new double[] { 30.0,
		// 89.0, 50.0 });
		// Candidate candidate2 = new Candidate("Mithra", "Mumbai", new double[] { 40.0,
		// 59.0, 60.0 });
		Candidate candidate3 = new Candidate("Piyush", "Delhi", new double[] { 70.0, 67.0, 54.0, 32.0 });

		em.getTransaction().begin();
		em.persist(candidate3);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}

	public static void read() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		Candidate candidate = em.find(Candidate.class, 3);

		System.out.println(candidate);

		em.close();
		emf.close();
	}

	public static void update() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		Candidate candidate = em.find(Candidate.class, 3);

		candidate.setCity("Chennai");
		candidate.getMarks()[0] = 33.0;
		em.merge(candidate);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}

	public static void readAll() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		String str = "from Candidate";
		Query query = em.createQuery(str, Candidate.class);

		List<Candidate> resultSet = query.getResultList();
		System.out.println(resultSet);

		em.close();
		emf.close();
	}

	public static void delete() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		Candidate candidate = em.find(Candidate.class, 3);

		em.getTransaction().begin();
		em.remove(candidate);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}

	public static void main(String[] args) {
		// insert();
		// read();
		// read();
		// update();

		delete();
		// readAll();
	}
}
