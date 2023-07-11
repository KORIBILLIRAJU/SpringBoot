package com.tmf.raju.SpringbootDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmf.raju.SpringbootDemo.Teacher;
import com.tmf.raju.SpringbootDemo.repository.TeacherRepository;
@Service
public class TeacherServicesImpl implements TeacherService{
	@Autowired
	private TeacherRepository repository;

	@Override
	public Teacher addTeacher(Teacher t) {
		// TODO Auto-generated method stub
		return repository.save(t);
	}

	@Override
	public List<Teacher> displayAllTeachers() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
