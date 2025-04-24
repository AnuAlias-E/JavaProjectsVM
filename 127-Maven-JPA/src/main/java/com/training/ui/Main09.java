package com.training.ui;

import java.time.LocalDate;

import com.training.model.ContactInfo;
import com.training.model.Person;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main09 {
	public static void test1() {

		Person person = new Person(101, "Keerthana", LocalDate.of(1992, 6, 10), 'F', null);
		ContactInfo contactInfo = new ContactInfo(5001, "keerthana@gmail.com", "347646737323");
		person.setContactInfo(contactInfo);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		em.persist(person);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}

	public static void read() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		Person person = em.find(Person.class, 101);

		System.out.println(person);

		em.close();
		emf.close();
	}

	public static void main(String[] args) {
		// test1();
		// test2();
		// test3();
		test4();
	}

	private static void test2() {
		Person person = new Person(102, "Amulya", LocalDate.of(2001, 12, 10), 'F', null);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		em.persist(person);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}

	private static void test3() {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		Person person = em.find(Person.class, 102);
		ContactInfo contactInfo = new ContactInfo(5002, "amulya@gmail.com", "322312121112");
		person.setContactInfo(contactInfo);

		em.getTransaction().begin();
		em.merge(person);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}

	private static void test4() {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		Person person = em.find(Person.class, 102);

		em.getTransaction().begin();
		em.remove(person);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}
}
