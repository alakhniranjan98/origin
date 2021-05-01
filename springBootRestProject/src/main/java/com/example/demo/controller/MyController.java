package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Course;
import com.example.demo.services.CourseService;

@RestController
public class MyController {
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/home")
	public String home() {
		return "This is first controller";
	}
	
	@GetMapping("/courses")
	public List<Course> getCourses(){
		return this.courseService.getCourses();
	}
	@GetMapping("course/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		return this.courseService.getCourse(Long.parseLong(courseId));
	}
	@PostMapping("/course")
	public Course addCourse(@RequestBody Course course) {
		return this.courseService.addCourse(course);
	}
	@DeleteMapping("/course/{courseId}")
	public long deleteCourse(@PathVariable String courseId) {
		return this.courseService.deleteCourse(Long.parseLong(courseId));
	}
	
	@PutMapping("/course/{courseId}")
	public Course updateCourse(@RequestBody Course course, @PathVariable String courseId) {
		return course;	
	}
	
}
