package com.training.ui;

import java.util.List;

import com.training.model.Account;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class Main01 {

	public static void insert() {
		Account account = new Account(1004, "Meera", "Savings", 56000.000);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		em.persist(account);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}

	public static void read() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		Account account = em.find(Account.class, 1002);

		System.out.println(account);

		em.close();
		emf.close();
	}

	public static void update() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		Account account = em.find(Account.class, 1002);

		account.setTypeOfAccount("Trading");
		em.merge(account);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}

	public static void readAll() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		String str = "from Account";
		Query query = em.createQuery(str, Account.class);

		List<Account> resultSet = query.getResultList();
		System.out.println(resultSet);

		em.close();
		emf.close();
	}


	public static void delete() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		
		Account account = em.find(Account.class, 1003);
		
		em.getTransaction().begin();
		em.remove(account);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}
	
	public static void main(String[] args) {
		// insert();
		readAll();

		// read();
		// update();
		delete();
	}

}
