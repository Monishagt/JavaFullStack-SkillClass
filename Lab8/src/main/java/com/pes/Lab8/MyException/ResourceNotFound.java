package com.pes.Lab8.MyException;

import org.springframework.http.HttpStatus;


import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)//when Record not found
public class ResourceNotFound extends RuntimeException {

	public ResourceNotFound(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
}