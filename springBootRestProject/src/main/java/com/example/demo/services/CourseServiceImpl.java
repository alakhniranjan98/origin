package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	List<Course> list;
	public CourseServiceImpl() {
		list=new ArrayList<>();
		list.add(new Course(146, "Spring Boot SAP", "SAP demo"));
		list.add(new Course(147, "This is demo", "for SAP"));
		
	}
	
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Course getCourse(long CourseId) {
		
		Course c=null;
		for(Course course:list) {
			if(course.getId()==CourseId) {
				c=course;
				break;
			}
		}
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

	@Override
	public long deleteCourse(long CourseId) {
		int c=0;
		for(Course course:list) {
			if(course.getId()==CourseId) {
				list.remove(c);
				break;
			}
			c++;
		}
		return CourseId;
	
	}

	@Override
	public Course updateCourse(Course course, long CourseId) {
	
		return course;
	}


}
