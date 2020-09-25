package com.example.student.repository;

import org.springframework.stereotype.Repository;

import com.example.student.entity.Student;
@Repository
public interface StudentRepository {
	public Student findById(int id);
}
