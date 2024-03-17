package com.codemind.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@ControllerAdvice
@ResponseStatus
public class RestRsesponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
      @ExceptionHandler
	ResponseEntity<ErrorMessage> employeeNotFoundexception(EmployeeNotException exception,
			WebRequest request){
		ErrorMessage message= new ErrorMessage(HttpStatus.NOT_FOUND, exception.getMessage());
		
		return new ResponseEntity<ErrorMessage>(message, HttpStatus.NOT_FOUND);
		
	}
}


