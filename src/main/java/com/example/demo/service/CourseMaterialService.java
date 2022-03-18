package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entity.CourseMaterial;
import com.example.demo.repository.CourseMaterialRepository;

@Service
public class CourseMaterialService {
	@Autowired
	CourseMaterialRepository repo;
	
public CourseMaterial findCourseMatById(int id) {
		
		return repo.findById(id).orElse(null);
		
	}
	
	public CourseMaterial saveCourseMaterial(CourseMaterial mat) {
		
	return	repo.save(mat);
		
	}
	
	public List<CourseMaterial> getAllCourse(){
		
		return repo.findAll();
		
	}

}
