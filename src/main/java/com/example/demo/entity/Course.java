package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
public class Course {
	@Id
  private	int courseId;
  private String name;
  private double  price;
  @OneToOne
  @JoinColumn(
			
			name = "courseMatId",referencedColumnName = "courseMatId")
  private CourseMaterial material;
@Override
public String toString() {
	return "Course [courseId=" + courseId + ", name=" + name + ", price=" + price + ", material=" + material + "]";
}
public int getCourseId() {
	return courseId;
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
public CourseMaterial getMaterial() {
	return material;
}
public void setMaterial(CourseMaterial material) {
	this.material = material;
}
public Course() {
	super();
}

}
