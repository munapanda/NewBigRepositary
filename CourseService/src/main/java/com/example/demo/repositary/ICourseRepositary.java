package com.example.demo.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Course;

public interface ICourseRepositary extends JpaRepository<Course, Integer> {

}
