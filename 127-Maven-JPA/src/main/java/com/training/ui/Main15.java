package com.training.ui;

import java.util.List;

import com.training.model.Loan;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class Main15 {
	public static void main(String[] args) {
		insert();
		// test1();
		// test2();
		// test3();

		// test4();
	}

	private static void insert() {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		Loan loan1 = new Loan("Anu Alias", 2000.0, 10);
		Loan loan2 = new Loan("Sara", 45000.0, 10);
		Loan loan3 = new Loan("Renju", 40000.0, 10);
		Loan loan4 = new Loan("Arun", 50000.0, 10);
		Loan loan5 = new Loan("Ram", 1000.0, 10);
		em.getTransaction().begin();
		em.persist(loan1);
		em.persist(loan2);
		em.persist(loan3);
		em.persist(loan4);
		em.persist(loan5);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}

	private static void test1() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		Query query = em.createNamedQuery("findAllLoans");
		List<Loan> loanList = query.getResultList();

		System.out.println(loanList);
		em.close();
		emf.close();
	}

	private static void test2() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		Query query = em.createNamedQuery("findByLoanId");
		query.setParameter("searchLoanId", 4);
		Loan loan = (Loan) query.getSingleResult();

		System.out.println(loan);
		em.close();
		emf.close();
	}

	private static void test3() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		Query query = em.createNamedQuery("updateLoanAmount");
		query.setParameter("searchLoanId", 3);
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

		Query query = em.createNamedQuery("deleteLoanBasedOnAmt");
		query.setParameter("minLoanCutOff", 2000);
		em.getTransaction().begin();
		int r = query.executeUpdate();
		em.getTransaction().commit();
		System.out.println(r + " records deleted");
		em.close();
		emf.close();
	}
}
