package com.training.ui;

import java.util.List;

import com.training.model.Address;
import com.training.model.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class Main05 {
	public static void insert() {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		Address address = new Address("765", "Kadvanthra", "Chennai", "875563");
		Employee employee = new Employee("Meena", address, 678932.0);

		em.getTransaction().begin();
		em.persist(employee);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}

	public static void read() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		Employee employee = em.find(Employee.class, 1);

		System.out.println(employee);

		em.close();
		emf.close();
	}

	public static void update() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		Employee employee = em.find(Employee.class, 1);
		Address address = new Address("765", "Mavelipuram", "Madurai", "7347834");
		employee.setAddress(address);
		employee.setBasicSalary(110000.00);
		em.merge(employee);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}

	public static void readAll() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		String str = "from Employee";
		Query query = em.createQuery(str, Employee.class);

		List<Employee> resultSet = query.getResultList();
		System.out.println(resultSet);

		em.close();
		emf.close();
	}

	public static void delete() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		Employee employee = em.find(Employee.class, 1);

		em.getTransaction().begin();
		em.remove(employee);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}

	public static void main(String[] args) {
		// insert();

		// read();
		// update();
		readAll();
		delete();
		readAll();
	}
}
