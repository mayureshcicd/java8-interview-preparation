package com.jav8.training.learn.imutable;

public final class ImutableData {

	private final String string;

	private ImutableData(String string) {
		
		this.string = string;
	}

	public String value() {
		return string;
	}

	public String concat(String arg0) {
		return string.concat(arg0);
	}
	public static ImutableData createImutableLove(String string)
	{
		return new ImutableData(string);
	}

	public String toString() {
		return string.toString();
	}
	
}
