package com.springrest.service;

import java.util.List;

import com.springrest.entity.Course;

public interface Service 
{
	public List<Course> getCourses();
	
	public Course getCourses(int courseId);
	
	public Course addCourse(Course course);
	
	public Course updateCourse(Course course);
	
	public void deleteCourse(int courseId);
}
