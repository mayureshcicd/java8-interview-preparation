package com.jav8.training.learn.dataProcessor.dataprocess;

import java.util.List;

public class Choice {
	private String type;
	private List<String> answers;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<String> getAnswers() {
		return answers;
	}
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	public Choice(String type, List<String> answers) {
		super();
		this.type = type;
		this.answers = answers;
	}
	@Override
	public String toString() {
		return "Choice [type=" + type + ", answers=" + answers + "]";
	}
	
}
