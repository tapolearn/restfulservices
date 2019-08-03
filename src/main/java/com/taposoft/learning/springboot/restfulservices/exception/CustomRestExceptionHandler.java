package com.taposoft.learning.springboot.restfulservices.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class CustomRestExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request) throws Exception {
		ErrorResponse errorResponse =  new ErrorResponse(LocalDateTime.now(),null,null);
		errorResponse.setMessage(ex.getMessage());

		return new ResponseEntity<Object>(errorResponse,HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(UserNotFoundException.class)
	public final ResponseEntity<Object> handleAllExceptions(UserNotFoundException ex, WebRequest request) throws Exception {
		ErrorResponse errorResponse =  new ErrorResponse(LocalDateTime.now(),null,null);
		errorResponse.setMessage(ex.getMessage());

		return new ResponseEntity<Object>(errorResponse,HttpStatus.NOT_FOUND);
	}	
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		
		ErrorResponse errorResponse =  new ErrorResponse(LocalDateTime.now(),null,null);
		errorResponse.setMessage(ex.getBindingResult().toString());
		return new ResponseEntity<Object>(errorResponse,HttpStatus.BAD_REQUEST);
	}

}
