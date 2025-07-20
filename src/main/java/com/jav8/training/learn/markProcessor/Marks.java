package com.jav8.training.learn.markProcessor;

public class Marks {

	private String subject;
	private int score;

	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
 
	public Marks(String subject, int score) {
		super();
		this.subject = subject;
		this.score = score;
	}
	@Override
	public String toString() {
		return "Marks [subject=" + subject + ", score=" + score + "]";
	}
	
  
	
}
