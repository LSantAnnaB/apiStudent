package com.santanna.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.santanna.api.model.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {

  
}
