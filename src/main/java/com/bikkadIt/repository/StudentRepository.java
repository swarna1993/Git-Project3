package com.bikkadIt.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.bikkadIt.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
