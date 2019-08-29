package com.johnbryce.SpringApp7BootMVC2.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;


@RestController
@RestControllerAdvice
public class ResponseExceptionHandler {
	
	 @ExceptionHandler(NumberFormatException.class)
     @ResponseStatus(HttpStatus.BAD_REQUEST)
	 public final ErrorDetails handleUserNotFoundException(NumberFormatException ex, WebRequest request) {
         ErrorDetails error = new ErrorDetails();
         error.setCode(HttpStatus.BAD_REQUEST.value());
         error.setMessage("Wrong Number Value!!!!!!!!! " + ex.getMessage());
         error.setValue(request.getParameter("num"));
         return error;
     }

}
