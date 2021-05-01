package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Course;

public interface CourseService {

	public List<Course> getCourses();
	public Course getCourse(long CourseId);
	public Course addCourse(Course course);
	public long deleteCourse(long CourseId);
	public Course updateCourse(Course course, long CourseId);
}
