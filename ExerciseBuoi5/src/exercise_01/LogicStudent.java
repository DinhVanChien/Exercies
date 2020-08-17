package exercise_01;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LogicStudent {
	public List<Student>  sortStudentById(List<Student> listStudents) {
		Collections.sort(listStudents, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getStudentId() - o2.getStudentId();
			}
		});
		return listStudents;
	}
	
	public int isStudentId(List<Student> listStudents, int studentId) {
		for(int i = 0; i < listStudents.size(); i++) {
			if(listStudents.get(i).getStudentId() == studentId) {
				return i;
			}
		}
		return listStudents.size();
	}
	
	public void printListStudent(List<Student> listStudents) {
		for(Student s : listStudents) {
			System.out.println(s);
		}
	}
}
