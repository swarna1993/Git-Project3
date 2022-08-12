package com.bikkadIt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bikkadIt.model.Student;
import com.bikkadIt.service.StudentServiceI;

@RestController
public class StudentController {
	
	@Autowired
	private StudentServiceI studentServiceI;
	
	@GetMapping(value="/getStudentById/{id}",produces="application/json")
	public ResponseEntity<Integer> addStudent(@RequestBody Student student) {
		
		int id = studentServiceI.addStudent(student);
		return new ResponseEntity<Integer>(HttpStatus.CREATED);
		
	}

}
