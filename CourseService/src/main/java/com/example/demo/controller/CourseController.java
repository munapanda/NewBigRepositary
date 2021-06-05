package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Course;
import com.example.demo.service.ICourseService;
import com.sun.tools.sjavac.Log;

@RestController
public class CourseController {
	private static final Logger log=LoggerFactory.getLogger(CourseController.class);
	@Autowired
	ICourseService service;
	@PostMapping("/save")
	public ResponseEntity<String> save(@RequestBody Course course){
		ResponseEntity<String> resp=null;
		try {
		Integer courseid=service.save(course);
		log.info("COURSE SAVED{}", courseid);
		resp=ResponseEntity.ok("Course"+courseid+"created");
	}
		catch(Exception e) {
			Log.error("UNABLE TO SAVE COURSE");
			e.printStackTrace();
		}
		log.info("Returning back from save method");
		return resp;
	}
	

}
