package com.educaweb.course.resources.exceptions;
import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.educaweb.course.services.exceptions.ResourceNotFOundException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	@ExceptionHandler(ResourceNotFOundException.class)
	public ResponseEntity<StandardError> resourceNotFound(ResourceNotFOundException e, HttpServletRequest request){
		String error ="Resource not Found";
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError err = new StandardError(Instant.now(),status.value(),error,e.getMessage(),request.getRequestURI());
	return ResponseEntity.status(status).body(err);
	}
	
}
