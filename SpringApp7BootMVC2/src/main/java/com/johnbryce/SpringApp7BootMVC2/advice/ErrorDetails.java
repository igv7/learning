package com.johnbryce.SpringApp7BootMVC2.advice;

import lombok.Data;

@Data
public class ErrorDetails {
	
	private int code;
	private String message;
	private String value;

}
