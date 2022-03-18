package com.example.demo.DTO;

import com.example.demo.entity.CourseMaterial;

public class CourseDTO {
	
	private int courseId;
	private String name;
	private double price;
	private CourseMaterial material;
	public int getCourseId() {
		return courseId;
	}
	public CourseMaterial getMaterial() {
		return material;
	}
	public void setMaterial(CourseMaterial material) {
		this.material = material;
	}
	@Override
	public String toString() {
		return "CourseDTO [courseId=" + courseId + ", name=" + name + ", price=" + price + ", material=" + material
				+ "]";
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public CourseDTO() {
		super();
	}

}
