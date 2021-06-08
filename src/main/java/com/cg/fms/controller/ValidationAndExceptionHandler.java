package com.cg.fms.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.cg.fms.exception.CartItemNotFoundException;
import com.cg.fms.exception.ProductNotFoundException;



@ControllerAdvice
public class ValidationAndExceptionHandler extends ResponseEntityExceptionHandler{

	
	@ExceptionHandler(value = ProductNotFoundException.class)
	public ResponseEntity<Object> exception(ProductNotFoundException exception) {

		return new ResponseEntity<>("Customer Not Found!!", HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value = CartItemNotFoundException.class)
	public ResponseEntity<Object> exception(CartItemNotFoundException exception) {

		return new ResponseEntity<>("Cart_item Not Found!!", HttpStatus.NOT_FOUND);
	}	
			


} 


