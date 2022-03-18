package com.example.demo.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.CourseMaterialDTO;
import com.example.demo.entity.Course;
import com.example.demo.entity.CourseMaterial;
import com.example.demo.service.CourseMaterialService;

@RestController
public class CourseMaterialController {
	@Autowired
	CourseMaterialService service;
	@Autowired
	ModelMapper mapper;
	

	
	@GetMapping("/getCourseMaterial/{id}")
	public ResponseEntity<?> getCourseMaterial(@PathVariable String id) {
		CourseMaterial courseMat = service.findCourseMatById(Integer.parseInt(id));
		CourseMaterialDTO dto = mapper.map(courseMat,CourseMaterialDTO.class);
		
		return ResponseEntity.ok(dto);
		
	}
	
	@PostMapping("/savecourseMaterial")
	public ResponseEntity<?> saveCourse(@RequestBody CourseMaterialDTO dto){
		
		CourseMaterial mat = mapper.map(dto, CourseMaterial.class);
		CourseMaterial cour = service.saveCourseMaterial(mat);
		CourseMaterialDTO course = mapper.map(cour, CourseMaterialDTO.class);
		
		return ResponseEntity.ok(course);
		
	}
	

}
