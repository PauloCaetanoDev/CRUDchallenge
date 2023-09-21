package com.paulovictor.CRUDchallenge.DTO;

public class FieldMessage {

	
	private String Fieldname;
	private String message;
	
	public FieldMessage(String fieldname, String message) {
		super();
		Fieldname = fieldname;
		this.message = message;
	}

	public String getFieldname() {
		return Fieldname;
	}

	public String getMessage() {
		return message;
	}
	
	
	
	
	
}
