package com.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.entity.Course;
import com.springrest.service.Service;

@RestController
public class MyController 
{	
	@Autowired
	private Service courseService;
	
	/*
	@GetMapping("/home")
	public String home()
	{
		return "This is home page";
	}
	*/
	
	// get courses
	//@RequestMapping(path="/courses" , method = RequestMethod.GET)
				//OR
	@GetMapping("/courses")
	public List<Course> getCourses()
	{
		return this.courseService.getCourses();
	}
	//get courses by course ID
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId)
	{
		return this.courseService.getCourses(Integer.parseInt(courseId));
	}
	// adding new course
	@PostMapping(path="/courses" , consumes="application/json")
	public Course addCourse(@RequestBody Course course)
	{
		return this.courseService.addCourse(course);
	}
	
	//for updating courses
	@PutMapping("/course")
	public Course updateCourse(@RequestBody Course course)
	{
		return this.courseService.updateCourse(course);
	}
	
	//for Deleting course
	@DeleteMapping("/courses/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId)
	{
		try 
		{
		this.courseService.deleteCourse(Integer.parseInt(courseId));
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		} 
		catch (Exception e) 
		{
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
