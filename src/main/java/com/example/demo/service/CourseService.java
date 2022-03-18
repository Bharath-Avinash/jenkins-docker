package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Course;
import com.example.demo.repository.CourseRepository;

@Service
public class CourseService {
	@Autowired
	CourseRepository repo ;
	
	public Course findCourseById(int id) {
		
		return repo.findById(id).orElse(null);
		
	}
	
	public Course saveCourse(Course course) {
		
	return	repo.save(course);
		
	}
	
	public List<Course> getAllCourse(){
		
		return repo.findAll();
		
	}

}
