package com.example.demo.controller;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.CourseDTO;
import com.example.demo.entity.Course;
import com.example.demo.service.CourseService;

@RestController
public class CourseController {
	@Autowired
	CourseService service;
	@Autowired
	ModelMapper mapper;
	
	@GetMapping("/getAllCourses")
	public List<Course> getAllCourse(){
		
		List<Course> list = service.getAllCourse();
		
	//	List<CourseDTO> courses = list.stream().map(c->mapper.map(c,CourseDTO.class)).collect(Collectors.toList());
		
		return list;
		
		
	}
	@GetMapping("/getCourse/{id}")
	public ResponseEntity<?> getCourse(@PathVariable String id) {
		Course course = service.findCourseById(Integer.parseInt(id));
		CourseDTO dto = mapper.map(course, CourseDTO.class);
		return ResponseEntity.ok(dto);
		
	}
	
	@PostMapping("/savecourse")
	public ResponseEntity<?> saveCourse(@RequestBody CourseDTO dto){
		Course course = mapper.map(dto, Course.class);
		Course cour = service.saveCourse(course);
		CourseDTO coursedto = mapper.map(cour, CourseDTO.class);
		
		return ResponseEntity.ok(coursedto);
		
	}

}
