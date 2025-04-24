package com.training.ui;

import java.util.ArrayList;
import java.util.List;

import com.training.model.Player;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class Main02 {

	public static void insert() {
		Player player1 = new Player(101, "Shubham Gill", "Batsman", 28, 100);
		Player player2 = new Player(102, "Sachin Tendulkar", "Allrounder", 40, 10);
		Player player3 = new Player(103, "Jadeja", "Bowler", 30, 150);
		Player player4 = new Player(104, "Virat Kohli", "Batsman", 34, 50);
		Player player5 = new Player(105, "M S Dhoni", "Wicket Keeper", 40, 35);
		Player player6 = new Player(106, "Ishann", "Batsman", 28, 89);
		Player player7 = new Player(107, "Rohit", "Batsman", 38, 90);

		List<Player> players = new ArrayList<>();
		players.add(player1);
		players.add(player2);
		players.add(player3);
		players.add(player4);
		players.add(player5);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
//		for (Player player : players) {
//			em.persist(player);
//		}
		em.persist(player6);
		em.persist(player7);

		em.getTransaction().commit();

		em.close();
		emf.close();
	}

	public static void read() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		Player player = em.find(Player.class, 102);

		System.out.println(player);

		em.close();
		emf.close();
	}

	public static void update() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		Player player = em.find(Player.class, 102);

		player.setTypeOfPlayer("Batsman");
		em.merge(player);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}

	public static void readAll() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		String str = "from Player";
		Query query = em.createQuery(str, Player.class);

		List<Player> resultSet = query.getResultList();
		System.out.println(resultSet);

		em.close();
		emf.close();
	}

	public static void delete() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		EntityManager em = emf.createEntityManager();

		Player player = em.find(Player.class, 104);

		em.getTransaction().begin();
		em.remove(player);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}

	public static void main(String[] args) {
		insert();

		// read();
		// update();
		// delete();
		readAll();
	}

}
