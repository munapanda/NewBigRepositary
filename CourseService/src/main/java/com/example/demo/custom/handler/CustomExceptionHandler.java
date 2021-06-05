package com.example.demo.custom.handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.errorcode.ErrorCode;
import com.example.demo.exception.CourseNotFoundException;

@RestController
@RestControllerAdvice
public class CustomExceptionHandler {
@ExceptionHandler(CourseNotFoundException.class)
 public ResponseEntity<ErrorCode> proceessCourseNotFoundException(CourseNotFoundException cnf){
	ErrorCode code=new ErrorCode(cnf.getMessage(),new Date().toString(),"Course","NOT EXISTS");
    return new ResponseEntity<ErrorCode>(code, HttpStatus.NOT_FOUND); 
}
}
