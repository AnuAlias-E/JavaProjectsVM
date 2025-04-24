package com.training.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Players")
public class Player {
	@Id
	@Column(name="player_id")	
	int id;
	@Column(name="player_name")	
	String name;
	@Column(name="player_type")	
	String typeOfPlayer;
	@Column(name="player_age")	
	int age;
	@Column(name="player_ranking")	
	int ranking;
	
	public Player() {
		super();
	}

	public Player(int id, String name, String typeOfPlayer, int age, int ranking) {
		super();
		this.id = id;
		this.name = name;
		this.typeOfPlayer = typeOfPlayer;
		this.age = age;
		this.ranking = ranking;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTypeOfPlayer() {
		return typeOfPlayer;
	}

	public void setTypeOfPlayer(String typeOfPlayer) {
		this.typeOfPlayer = typeOfPlayer;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	@Override
	public String toString() {
		return "\nPlayer [id=" + id + ", name=" + name + ", typeOfPlayer=" + typeOfPlayer + ", age=" + age + ", ranking="
				+ ranking + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Player))
			return false;
		Player other = (Player) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
}
