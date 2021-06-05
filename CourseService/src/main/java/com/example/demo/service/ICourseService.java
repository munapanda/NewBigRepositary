package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Course;

public interface ICourseService {
	public Integer save(Course course);
	public Course getOneCourse(Integer id);
	public List<Course> getAllCourse();

}
