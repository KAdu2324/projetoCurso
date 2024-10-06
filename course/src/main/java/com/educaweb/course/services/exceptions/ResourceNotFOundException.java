package com.educaweb.course.services.exceptions;

public class ResourceNotFOundException extends RuntimeException{

	
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFOundException(Object id) {
		super("Resourc not found. id" + id);
	}

}
