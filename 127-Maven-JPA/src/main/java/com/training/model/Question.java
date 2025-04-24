package com.training.model;

import java.util.Arrays;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OrderColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "questions")
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column
	String questionText;
	@Column
	int mark;
	@ElementCollection
	@CollectionTable(name = "question_choices")
	@OrderColumn(name = "idx")
	String[] answerChoices;

	public Question() {
		super();
	}

	public Question(String questionText, int mark, String[] answerChoices) {
		super();
		this.questionText = questionText;
		this.mark = mark;
		this.answerChoices = answerChoices;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public String[] getAnswerChoices() {
		return answerChoices;
	}

	public void setAnswerChoices(String[] answerChoices) {
		this.answerChoices = answerChoices;
	}

	@Override
	public String toString() {
		return "\nQuestion [id=" + id + ", questionText=" + questionText + ", mark=" + mark + ", answerChoices="
				+ Arrays.toString(answerChoices) + "]";
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
		if (!(obj instanceof Question))
			return false;
		Question other = (Question) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
