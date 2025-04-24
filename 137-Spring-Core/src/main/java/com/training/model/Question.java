package com.training.model;

import java.util.List;

public class Question {
String questionText;
int score;
List<AnswerChoice>choices;


public String getQuestionText() {
	return questionText;
}
public void setQuestionText(String questionText) {
	this.questionText = questionText;
}
public int getScore() {
	return score;
}
public void setScore(int score) {
	this.score = score;
}
public List<AnswerChoice> getChoices() {
	return choices;
}
public void setChoices(List<AnswerChoice> choices) {
	this.choices = choices;
}
@Override
public String toString() {
	return "Question [questionText=" + questionText + ", score=" + score + ", choices=" + choices + "]";
}


}
