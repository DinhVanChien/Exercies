package com.example.student.repository.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.student.database.StudentDatabase;
import com.example.student.entity.Student;
import com.example.student.repository.StudentRepository;

@Repository
public class StudentRepositoryImpl implements StudentRepository{

	@Override
	public Student findById(int id) {
		List<Student> students = StudentDatabase.StudentData();
		for(Student s : students) {
			if(s.getId() == id) {
				return s;
			}
		}
		return null;
	}

}
