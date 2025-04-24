package com.training.ui;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class Main13 {
	public static void main(String[] args) {
		test1();
	}

	private static void test1() {
		String qry = "select d.name,d.fees from Doctor d";
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		Query query = em.createQuery(qry);
		List<Object[]> results = query.getResultList();
		for (Object[] cols : results) {
			System.out.println(cols[0] + " :\t\t" + cols[1]);
		}

		em.close();
		emf.close();
	}
}
