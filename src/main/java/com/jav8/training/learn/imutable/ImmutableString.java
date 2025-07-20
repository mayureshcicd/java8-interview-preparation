package com.jav8.training.learn.imutable;

public final class ImmutableString {

	private final String string;

	public ImmutableString(String string) {
		this.string = string;
	}
	
	public String value() {
		return string;
	}
	public String getReverseString() {
		return new StringBuilder().append(string).reverse().toString();
	}
	public String toUpper() {
		return string.toUpperCase();
	}

	@Override
	public String toString() {
		return  string ;
	}
	
}
