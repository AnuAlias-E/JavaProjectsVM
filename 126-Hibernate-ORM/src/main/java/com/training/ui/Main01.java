package com.training.ui;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.training.model.Contact;

public class Main01 {
	public static void insert() {
		Contact contact = new Contact(104, "Raja", "raja@gmail.com", "77438439898");
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();

		session.getTransaction().begin();
		session.persist(contact);
		session.getTransaction().commit();

		session.close();
		sessionFactory.close();
	}

	public static void read() {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();

		Contact contact;
		contact = session.find(Contact.class, 101);
		System.out.println(contact);

		session.close();
		sessionFactory.close();
	}

	public static void update() {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();

		Contact contact = session.find(Contact.class, 101);
		contact.setName(contact.getName().toUpperCase());

		session.getTransaction().begin();
		session.merge(contact);
		session.getTransaction().commit();

		session.close();
		sessionFactory.close();
	}

	public static void readAll() {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();

		String str = "from Contact";// HQL Query
		Query<Contact> query = session.createQuery(str, Contact.class);
		List<Contact> contactList = query.getResultList();
		System.out.println(contactList);

		session.close();
		sessionFactory.close();
	}

	public static void delete() {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();

		Contact contact = session.find(Contact.class, 103);

		session.getTransaction().begin();
		session.remove(contact);
		session.getTransaction().commit();

		session.close();
		sessionFactory.close();
	}
	public static void main(String[] args) {
		delete();
	}
}
