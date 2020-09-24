package com.example.student.repository.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.student.database.StudentDatabase;
import com.example.student.entities.Student;
import com.example.student.repository.StudentRepository;

@Repository
public class StudentRepositoryImpl implements StudentRepository{

	@Override
	public Student findById(int id) {
		List<Student> students = StudentDatabase.StudentData();
		Student student = new Student();
		for(Student s : students) {
			if(s.getId() == id) {
				student.setId(s.getId());
				student.setName(s.getName());
				student.setAge(s.getAge());
				student.setSubject(s.getSubject());
			}
		}
		return student;
	}

}
