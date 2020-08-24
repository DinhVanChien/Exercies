package bai4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.alibaba.fastjson.JSON;

public class Application {
	
	public static void saveStudentInJsonFile(List<Student> listStudents) throws IOException {
		StringBuilder studentsStr = new StringBuilder();
		for(Student s : listStudents) {
			studentsStr.append(JSON.toJSONString(s)).append("\n");
		}
		File studentJson = new File("D:\\File/student");
		if(!studentJson.exists()) {
			studentJson.createNewFile();
		}
		FileOutputStream fOS = null;
		try {
			fOS = new FileOutputStream(studentJson);
			byte[] b = studentsStr.toString().trim().getBytes();
			fOS.write(b);
			fOS.flush();
		} catch (Exception e) {
			fOS.close();
		}
	}
	
	public static void infoStudent(Student s) {
		System.out.println("ID sinh viên: "+s.getId());
		System.out.println("Tên sinh viên: "+s.getName());
		System.out.println("Tuổi sinh viên: "+s.getAge());
		System.out.println("Lớp sinh viên học: "+s.getClassSc());
		System.out.println("Môn học của sinh viên: "+s.getSubject());
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số lượng sinh viên cần nhập");
		int numberStudents = sc.nextInt();
		List<Student> listStudent = new ArrayList<Student>();
		for(int i = 1;  i <= numberStudents ; i++) {
			System.out.println("Nhập sinh viên thứ "+i);
			Student student = new Student();
			System.out.print("Nhập ID sinh viên: ");
			student.setId(sc.nextInt());
			sc.nextLine();
			System.out.print("Nhập tên sinh viên: ");
			student.setName(sc.nextLine());
			System.out.print("Nhập tuổi sinh viên: ");
			student.setAge(sc.nextInt());
			sc.nextLine();
			System.out.print("Nhập lớp học sinh viên: ");
			student.setClassSc(sc.nextLine());
			System.out.print("Nhập môn học sinh viên: ");
			student.setSubject(sc.nextLine());
			listStudent.add(student);
			}
		
		saveStudentInJsonFile(listStudent);
		
		System.out.println("Chọn 1 nếu hiển thị toàn bộ sinh viên chọn 2"
				+ "nếu hiển thị sinh viên theo ID");
		System.out.println("Nếu chọn khác 1 và 2 thì bạn sẽ thoát chương trình");
		int seclectOption = sc.nextInt();
		if(seclectOption == 1) {
			System.out.println("-------Danh sách thông tin sinh viên-------");
			for(Student s : listStudent) {
				infoStudent(s);
				System.out.println();
			}
		} else if (seclectOption == 2) {
			System.out.println("Bạn hãy nhập ID sinh viên muốn hiển thị");
			int id = sc.nextInt();
			for(Student s : listStudent) {
				if(id == s.getId()) {
					infoStudent(s);
				} else {
					System.out.println("ID sinh viên không tồn tại");
				}
			}
		} else {
			System.out.println("Bạn đã thoát chương trình");
		}
	}
}
