package com.bikkadIt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bikkadIt.model.Student;
import com.bikkadIt.repository.StudentRepository;

public class StudentServiceImpl implements StudentServiceI{
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public int addStudent(Student student) {
		Student save = studentRepository.save(student);
		return save.getStudentId();
	}

	@Override
	public List<Student> getAllstudent() {
		List<Student> findAll = studentRepository.findAll();
		return findAll;
	}

	@Override
	public Student getStudentbyId(Integer id) {
		Student findById = studentRepository.findById(id).get();
		return findById;
	}

}
