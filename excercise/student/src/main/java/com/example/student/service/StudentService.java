package com.example.student.service;

import org.springframework.stereotype.Service;

import com.example.student.entities.Student;
@Service
public interface StudentService {
	public Student findById(int id);
}
