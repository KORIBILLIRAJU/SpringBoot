package com.tmf.raju.SpringbootDemo.service;

import java.util.List;

import com.tmf.raju.SpringbootDemo.Teacher;

public interface TeacherService {
	Teacher addTeacher(Teacher t);
	List<Teacher> displayAllTeachers();

}
