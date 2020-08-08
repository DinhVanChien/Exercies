package run_application;

import java.util.Scanner;

import object.ChuanHoaChuoi;
import object.Student;

public class RunMain {
	/**
	 * method show ra những thông báo cho người dùng
	 */
	public static void message() {
		System.out.println("Bạn vui lòng chọn: ");
		System.out.println("Chọn 1 => Chuẩn hóa chuỗi ");
		System.out.println("Chọn 2 => Convert Object Student sang format Json");
		System.out.println("Nếu muốn thoát chương trình hãy nhập giá trị khác 1 hoặc 2");
		System.out.println("---------------------------------------------------------------");
	}
	/**
	 * Hàm main run chương trình
	 * @param args
	 */
	public static void main(String[] args) {
		ChuanHoaChuoi chuanHoaChuoi = new ChuanHoaChuoi();
		Student student = new Student();
	
		message();
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		scanner.nextLine();
		while(input >= 1 && input <= 2) {
			if(input == 1) {
				System.out.println("Bạn hãy nhập chuỗi cần chuẩn hóa");
				chuanHoaChuoi.chuoi = scanner.nextLine();
				System.out.println("Chuỗi sau khi đã được chuẩn hóa là: ");
			    System.out.println(chuanHoaChuoi.chuanHoaChuoi(chuanHoaChuoi.chuoi));	
			} else {
				System.out.println("Bạn hãy nhập các giá trị của các thuộc tính object student");
				System.out.print("Nhập tên: ");
				student.name = scanner.nextLine();
				System.out.print("Nhập tuổi: ");
				student.age = scanner.nextInt();
				System.out.print("Nhập môn học: ");
				scanner.nextLine();
				student.subject = scanner.nextLine();
				System.out.print("Nhập trường học: ");
				student.school = scanner.nextLine();
				System.out.println("Object Student sau khi được convert sang Json là ");
				System.out.println(student.convertObjetStudenToJson(student));
			}
			message();
			input = scanner.nextInt();
			scanner.nextLine();
		}
		if(input < 1 || input > 2) {
			System.out.println("Bạn đã thoát chương trình.");
		}
	}

}
