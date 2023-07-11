package com.tmf.raju.SpringbootDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tmf.raju.SpringbootDemo.Teacher;
import com.tmf.raju.SpringbootDemo.service.TeacherService;
@RestController
public class TeacherController {
	@Autowired
	private TeacherService service;
	
	@PostMapping("/teacher")
	public void addTeacher(@RequestBody Teacher t) {
		service.addTeacher(t);
	}
	
	@GetMapping("/teacher")
	public List<Teacher> displayAllTeachers() {
		return service.displayAllTeachers();
	}

}
