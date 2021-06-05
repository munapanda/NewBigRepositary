package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Course;
import com.example.demo.exception.CourseNotFoundException;
import com.example.demo.repositary.ICourseRepositary;

public class CourseServiceimpl implements ICourseService {
    @Autowired
	private ICourseRepositary repo;
	@Override
	public Integer save(Course course) {
		Course coursee=repo.save(course);
		return coursee.getCid();
	}

	@Override
	public Course getOneCourse(Integer id) {
		return repo.findById(id).orElseThrow(()-> new CourseNotFoundException("Course Not Found Exception"));
		
	}

	@Override
	public List<Course> getAllCourse() {
		List<Course> course=repo.findAll();
		return course;
	}

}
