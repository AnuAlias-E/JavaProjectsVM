package com.training.ui;

import java.time.LocalDate;
import java.util.List;

import com.training.model.Doctor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class Main11 {
	public static void main(String[] args) {
		// insert();
		test1();
		// test2();
		// test3();

		// test4();
	}

	private static void insert() {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		Doctor doctor1 = new Doctor("Meena", 500.0, "Female", LocalDate.of(2001, 10, 12));
		Doctor doctor2 = new Doctor("Arun", 800.0, "Male", LocalDate.of(2003, 9, 11));
		Doctor doctor3 = new Doctor("Fida", 650.0, "Female", LocalDate.of(2010, 11, 14));
		Doctor doctor4 = new Doctor("Ram", 950.0, "Male", LocalDate.of(2024, 7, 23));
		Doctor doctor5 = new Doctor("Meera", 850.0, "Female", LocalDate.of(2019, 8, 15));

		em.getTransaction().begin();
		em.persist(doctor1);
		em.persist(doctor2);
		em.persist(doctor3);
		em.persist(doctor4);
		em.persist(doctor5);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}

	private static void test1() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		Query query = em.createNamedQuery("findAll");
		List<Doctor> doctorList = query.getResultList();

		System.out.println(doctorList);
		em.close();
		emf.close();
	}

	private static void test2() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		Query query = em.createNamedQuery("findById");
		query.setParameter("searchId", 4);
		Doctor doctor = (Doctor) query.getSingleResult();

		System.out.println(doctor);
		em.close();
		emf.close();
	}

	private static void test3() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		Query query = em.createNamedQuery("updateFees");
		em.getTransaction().begin();
		int r = query.executeUpdate();
		em.getTransaction().commit();
		System.out.println(r + " records updated");
		em.close();
		emf.close();
	}

	private static void test4() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		Query query = em.createNamedQuery("deleteBasedOnFees");
		query.setParameter("feesCutOff", 800);
		em.getTransaction().begin();
		int r = query.executeUpdate();
		em.getTransaction().commit();
		System.out.println(r + " records deleted");
		em.close();
		emf.close();
	}
}
