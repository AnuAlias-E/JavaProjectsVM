package com.training.ui;

import java.util.List;

import com.training.model.Loan;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class Main16 {

	private static void test1() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();
		String nSql = "select * from loans";

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
		String nSql = "select * from loans";

		Query query = em.createNativeQuery(nSql, Loan.class);
		List<Loan> results = query.getResultList();
		System.out.println(results);

		em.close();
		emf.close();
	}

	private static void test3() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();
		String nSql = "select * from loans l where l.id= :searchId";

		Query query = em.createNativeQuery(nSql, Loan.class);
		query.setParameter("searchId", 4);
		Loan loan = (Loan) query.getSingleResult();

		System.out.println(loan);
		em.close();
		emf.close();
	}

	private static void test4() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();
		String nSql = "update  loans l set l.loanamount=l.loanamount+5400 where l.id= :searchId";

		em.getTransaction().begin();
		Query query = em.createNativeQuery(nSql, Loan.class);
		query.setParameter("searchId", 4);
		int r = query.executeUpdate();
		em.getTransaction().commit();
		System.out.println(r + " records updated");
		em.close();
		emf.close();
	}

	private static void test5() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();
		String nSql = "delete from  loans l  where l.loanamount<= :loanamount";

		em.getTransaction().begin();
		Query query = em.createNativeQuery(nSql, Loan.class);
		query.setParameter("loanamount", 1000);
		int r = query.executeUpdate();
		em.getTransaction().commit();
		System.out.println(r + " records deleted");
		em.close();
		emf.close();
	}

	public static void main(String[] args) {
		// test1();
		// test2();
		// test3();
		// test4();
		test5();
	}

}
