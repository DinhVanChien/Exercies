package com.example.student.database;

import java.util.ArrayList;
import java.util.List;

import com.example.student.entities.Student;

/*
 * Class này ví dụ là Database
 */
public class StudentDatabase { 
	public static List<Student> StudentData() {
		List<Student> listStudent = new ArrayList<Student>();
		Student student1 = new Student(1, "Chiến", 25, "JavaWeb");
		Student student2 = new Student(2, "Tấn", 21, "JavaWeb");
		Student student3 = new Student(3, "Thắng", 23, "JavaWeb");
		listStudent.add(student1);
		listStudent.add(student2);
		listStudent.add(student3);
		return listStudent;
	}
}
