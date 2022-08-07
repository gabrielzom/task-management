package com.example.demoapi.utils.response.exceptions;
public class InvalidFormatResponseEntity extends ExceptionResponseEntity {
	
	public InvalidFormatResponseEntity() {
		this.message = "Value of the some parameter is not valid.";
		this.statusText = "Bad Request";
		this.status = 400;
	}
}
