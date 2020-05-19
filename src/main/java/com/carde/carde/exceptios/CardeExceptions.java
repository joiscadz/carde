package com.carde.carde.exceptios;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CardeExceptions extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	private final String statusCode;

	public CardeExceptions(String message, String statusCode) {
		super(message);
		this.statusCode = statusCode;
	}

}
