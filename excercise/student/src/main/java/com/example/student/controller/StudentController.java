package com.example.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.entities.Student;
import com.example.student.service.StudentService;

@RestController
@RequestMapping("/book")
public class StudentController {
	
	private StudentService studentService;
	
	@Autowired
	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}
	
	@GetMapping("/{id}")
	public Student findStudentById(@PathVariable("id") String id) throws Exception {
		Student student = new Student();
		if(id.matches("\\d+")) {
			student = studentService.findById(Integer.parseInt(id));
		} else {
			throw new Exception("Id nhập vào phải là number");
		}
		return student;
	}
}
