package com.example.demoapi.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.example.demoapi.utils.response.exceptions.InvalidFormatResponseEntity;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;

@RestControllerAdvice
public class InvalidFormatController {
	@ExceptionHandler(InvalidFormatException.class)
	public ResponseEntity<InvalidFormatResponseEntity> handleInvalidFormatException() {
		return new ResponseEntity<>(new InvalidFormatResponseEntity(), HttpStatus.BAD_REQUEST);
	}
}
