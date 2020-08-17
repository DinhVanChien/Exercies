package exercise_01;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import exception.ValidateException;

public class RunApplication {
	public static int inputScaner(int input, Scanner scanner, ValidateException validateException) {
		try {
			input = scanner.nextInt();
		} catch (Exception e) {
			validateException.inputNumberException();
			scanner.nextLine();
			input = scanner.nextInt();
		}
		return input;
	}

	public static void main(String[] args) {
		List<Student> listStudents = new LinkedList<Student>();
		Student student1 = new Student(1, "A", 18);
		Student student2 = new Student(9, "G", 28);
		Student student3 = new Student(5, "K", 20);
		Student student4 = new Student(6, "B", 19);
		Student student5 = new Student(4, "H", 22);
		Student student6 = new Student(2, "C", 21);
		Student student7 = new Student(3, "M", 20);
		Student student8 = new Student(7, "G", 23);
		Student student9 = new Student(8, "K", 24);
		Student student10 = new Student(10, "B", 25);
		listStudents.add(student1);
		listStudents.add(student2);
		listStudents.add(student3);
		listStudents.add(student4);
		listStudents.add(student5);
		listStudents.add(student6);
		listStudents.add(student7);
		listStudents.add(student8);
		listStudents.add(student9);
		listStudents.add(student10);

		LogicStudent logicStudent = new LogicStudent();
		logicStudent.sortStudentById(listStudents);
		System.out.println("List Stuents");
		logicStudent.printListStudent(listStudents);

		Scanner scanner = new Scanner(System.in);
		ValidateException validateException = new ValidateException();
		System.out.println("Nhập StudentId");
		int inputStuId = 0;
		inputStuId = inputScaner(inputStuId, scanner, validateException);
		int index = logicStudent.isStudentId(listStudents, inputStuId);
		
		while (index == listStudents.size()) {
			System.out.println("StudentId không tồn tại vui lòng nhập lại");
			inputStuId = inputScaner(inputStuId, scanner, validateException);
			index = logicStudent.isStudentId(listStudents, inputStuId);
		}
		
		listStudents.remove(listStudents.get(index));
		System.out.println("List Stuents sau khi xóa");
		logicStudent.printListStudent(listStudents);

	}

}
