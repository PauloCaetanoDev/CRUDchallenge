package com.paulovictor.CRUDchallenge.DTO;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ValidationError extends CustomError {
	
	
	private List<FieldMessage> errors = new ArrayList<>();

	public ValidationError(Instant timestamp, Integer status, String error, String path) {
		super(timestamp, status, error, path);
	}

	public List<FieldMessage> getErrors() {
		return errors;
	}
	
	public void addError(String fieldname, String message) {
		
		errors.add(new FieldMessage(fieldname, message));
	}

}
