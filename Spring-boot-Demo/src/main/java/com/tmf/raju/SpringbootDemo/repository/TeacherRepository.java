package com.tmf.raju.SpringbootDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tmf.raju.SpringbootDemo.Teacher;
@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long>{

}

