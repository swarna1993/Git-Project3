package com.bikkadIt.service;

import java.util.List;

import com.bikkadIt.model.Student;

public interface StudentServiceI {
	
	public int addStudent(Student student);
	
	public List<Student> getAllstudent();
	
	public Student getStudentbyId();

}
