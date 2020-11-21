package com.example.bookstore.exception;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class CustomeHandlerException {
	private static final Logger logger = Logger.getLogger(CustomeHandlerException.class);
	@ExceptionHandler(NotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public ErrorException getNotFoundException(NotFoundException ex, WebRequest rq) {
		logger.error(ex.getMessage());
		return new ErrorException(HttpStatus.NOT_FOUND, ex.getMessage());
	}
}
