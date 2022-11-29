package com.springrest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.springrest.dao.Dao;
import com.springrest.entity.Course;

@org.springframework.stereotype.Service
public class ServiceIMPL implements Service {

	@Autowired
	private Dao courseDao;
	
	/*
	List<Course> list;
	*/
	
	public ServiceIMPL()
	{
		/*
		list= new ArrayList<Course>();
		list.add(new Course(145, "Core Java" ,"This course contained many of topics"));
		list.add(new Course(4343, "SpringBoot" ,"Creating RestAPI using SpringBoot"));
		*/
	}
	
	@Override
	public List<Course> getCourses() 
	{	
		/*
		return list;
		*/
		return courseDao.findAll();
	}

	@Override
	public Course getCourses(int courseId) 
	{
		/*
		Course c=null;
		for (Course course:list)
		{
			if(course.getId()==courseId)
			{
				c=course;
				break;
			}
		}
		return c;
		*/
		return courseDao.getOne(courseId);
	}

	@Override
	public Course addCourse(Course course) 
	{
		/*
		list.add(course);
		return course;
		*/
		courseDao.save(course);
		return course;
		
	}

	@Override
	public Course updateCourse(Course course) 
	{
		/*
		list.forEach(e->{
			if(e.getId()==course.getId())
			{
				e.setTitle(course.getTitle());
				e.setDiscreption(course.getDiscreption());
			}
		});
		return course;
		*/
		
		// same as add method because there is not any method for update and 
		// If we provide Id for save details then it will work as update
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(int parseInt) 
	{
		/*
		List<Course> list2 = list.stream().filter(e->e.getId() != parseInt).collect(Collectors.toList());		
		*/
		Course entity=courseDao.getOne(parseInt);
		courseDao.delete(entity);
	}

}
