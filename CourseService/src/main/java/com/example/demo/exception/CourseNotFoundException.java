package com.example.demo.exception;

import org.springframework.stereotype.Component;

@Component
public class CourseNotFoundException extends RuntimeException {
	
public  CourseNotFoundException() {
	super();
	
}
public  CourseNotFoundException(String messege) {
	super(messege);
	
}
}
