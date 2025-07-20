package com.jav8.training.learn.customException;

import java.util.ArrayList;
import java.util.List;

public class CustomException extends RuntimeException {

	private static final long serialVersionUID = -9106365546089010911L;
	private final String httpStatus;
	private List<String> errorMessage = new ArrayList<>();
	private String error="";

	public CustomException(String message, String httpStatus) {
		super(message);
		this.httpStatus = httpStatus;
		this.error=message;
	}

	public CustomException(List<String> message, String httpStatus) {
		super(message.toString());
		this.httpStatus = httpStatus;
		this.errorMessage.addAll(message);
	}

	public String getHttpStatus() {
		return httpStatus;
	}

	public List<String> getErrorMessages() {
		return errorMessage;
	}

	 
	public String getError() {
		return error;
	}

}