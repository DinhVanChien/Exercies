package exercise_02;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import exception.ValidateException;

public class RunApplication {
	public static void message() {
		System.out.println("Chọn role trước khi sử dụng nhập 1 nếu là Customer nhập 2 nếu là Employee");
	}
	public static int inputScaner(int input,Scanner scanner , ValidateException validateException) {
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
		Queue<Customer> listCustomers = new LinkedList<Customer>();
		ValidateException validateException = new ValidateException();
		Scanner scanner = new Scanner(System.in);
		message();
		int input = 0;
		input = inputScaner(input, scanner, validateException);
		while (input >= 1 && input <= 2) {
			if(input == 1) {
				System.out.println("Để đăng kí phục vụ vui lòng nhập tên và scm");
				Customer customer = new Customer();
				System.out.print("Nhập tên: ");
				customer.setName(scanner.nextLine());
				scanner.nextLine();
				System.out.print("Nhập scm: ");
				int cnm = inputScaner(input, scanner, validateException);
				customer.setCmt(cnm);
				listCustomers.add(customer);
			} else {
				System.out.println("Bạn vui lòng nhập 3 để phục vụ khách hàng");
				int selectCustomer = 0;
				selectCustomer = inputScaner(selectCustomer, scanner, validateException);
				if (selectCustomer == 3) {
					try {
						Customer customer = listCustomers.poll();
						customer.printCustomer();
					} catch (NullPointerException e) {
						validateException.nullCustomerException();
					}
				}
			}
			
			message();
			input = inputScaner(input, scanner, validateException);
		}
	}
}
