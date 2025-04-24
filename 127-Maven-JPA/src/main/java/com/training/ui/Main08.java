package com.training.ui;

import java.time.LocalDate;
import java.util.List;

import com.training.model.Bill;
import com.training.model.BillItem;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class Main08 {

	public static void insert() {

		Bill bill = new Bill("Keerthi", LocalDate.of(2024, 12, 12));
		bill.addBillItem(new BillItem(1, "Dell", 2, 10000));
		bill.addBillItem(new BillItem(2, "Iphone", 1, 50000));
		bill.addBillItem(new BillItem(3, "Logitech Mouse", 10, 400.0));
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		em.persist(bill);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}

	public static void read() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		Bill bill = em.find(Bill.class, 1);

		System.out.println(bill);

		em.close();
		emf.close();
	}

	public static void update() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		Bill bill = em.find(Bill.class, 1);

		bill.addBillItem(new BillItem(8, "Panasonic", 3, 55000.0));

		bill.addBillItem(new BillItem(9, "OnePlus", 7, 88000.0));
		BillItem billItem = bill.getBillitems().get(1);
		bill.removeBillItem(billItem);

		em.merge(bill);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}

	public static void readAll() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		String str = "from Bill";
		Query query = em.createQuery(str, Bill.class);

		List<Bill> resultSet = query.getResultList();
		System.out.println(resultSet);

		em.close();
		emf.close();
	}

	public static void delete() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		Bill bill = em.find(Bill.class, 3);

		em.getTransaction().begin();
		em.remove(bill);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}

	public static void main(String[] args) {
		// insert();

		read();
		update();
		read();
		// readAll();
		// delete();
		// readAll();
	}

}
