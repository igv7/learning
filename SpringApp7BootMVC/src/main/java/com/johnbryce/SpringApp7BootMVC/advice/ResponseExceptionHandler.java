package com.johnbryce.SpringApp7BootMVC.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
@RestController
public class ResponseExceptionHandler {
	 @ExceptionHandler(NumberFormatException.class)
     @ResponseStatus(HttpStatus.BAD_REQUEST)
     
	 public final ErrorDetails handleUserNotFoundException(NumberFormatException ex, WebRequest request) {
         ErrorDetails err=new ErrorDetails();
         err.setCode(HttpStatus.BAD_REQUEST.value());
         err.setMessage("Wrong Number Value!!!!!!!!! " + ex.getMessage());
         err.setValue(request.getParameter("num"));
         return err;
     }
}
