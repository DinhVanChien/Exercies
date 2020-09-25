package com.example.student.service;

import org.springframework.stereotype.Service;

import com.example.student.entity.Student;
@Service
public interface StudentService {
	public Student findById(int id);
}
