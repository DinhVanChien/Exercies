package bai3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;


public class ReadLetterInFile {
	
	public static String readLetterN_To_M_InFile(String value, int n, int m) {
		if(m > value.length()) {
			return "Error, kí tự thứ m không tồn tại.";
		}
		return value.substring(n,m);
	}

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\File/demo");
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
			StringBuilder value = new StringBuilder();
			int i;
			while((i = fileInput.read()) != -1) {
				value.append(String.valueOf((char)i));
			}
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhập kí tự thứ n và kí tự thứ m trong file");
			System.out.print("Nhập n: ");
			int n = sc.nextInt();
			System.out.print("Nhập m: ");
			int m = sc.nextInt();
			System.out.println(readLetterN_To_M_InFile(value.toString(), n, m));
		} finally {
			fileInput.close();
		}
		
	}

}
