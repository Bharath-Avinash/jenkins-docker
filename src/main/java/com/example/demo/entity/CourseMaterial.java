package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
public class CourseMaterial {
	@Id
	private int courseMatId;
	public int getCourseMatId() {
		return courseMatId;
	}

	public void setCourseMatId(int courseMatId) {
		this.courseMatId = courseMatId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	


	public CourseMaterial() {
		super();
	}

	private String url;
	
	


}
