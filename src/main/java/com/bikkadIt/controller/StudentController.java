package com.bikkadIt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.bikkadIt.service.StudentServiceI;

@RestController
public class StudentController {
	
	@Autowired
	private StudentServiceI studentServiceI;

}
