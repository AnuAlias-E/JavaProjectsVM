package com.training.model;

public class AnswerChoice {
String answerText;
boolean rightChoice;
public String getAnswerText() {
	return answerText;
}
public void setAnswerText(String answerText) {
	this.answerText = answerText;
}
public boolean isRightChoice() {
	return rightChoice;
}
public void setRightChoice(boolean rightChoice) {
	this.rightChoice = rightChoice;
}
@Override
public String toString() {
	return "AnswerChoice [answerText=" + answerText + ", rightChoice=" + rightChoice + "]";
}


}
