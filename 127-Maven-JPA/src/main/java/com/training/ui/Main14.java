package com.training.ui;

import java.util.List;

import com.training.model.Doctor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class Main14 {

	private static void test1() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();
		String nSql = "select * from doctors";

		Query query = em.createNativeQuery(nSql);
		List<Object[]> results = query.getResultList();
		for (Object[] cols : results) {
			for (Object obj : cols) {
				System.out.print(obj + "\t\t");
			}
			System.out.println();
		}

		em.close();
		emf.close();
	}

	private static void test2() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();
		String nSql = "select * from doctors";

		Query query = em.createNativeQuery(nSql, Doctor.class);
		List<Doctor> results = query.getResultList();
		System.out.println(results);

		em.close();
		emf.close();
	}

	public static void main(String[] args) {
		test2();
	}
}
