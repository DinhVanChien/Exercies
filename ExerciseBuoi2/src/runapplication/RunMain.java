package runapplication;

import java.util.Scanner;
/**
 * 
 * @author Đinh Văn Chiến
 *
 */
import entity.FindListNumber;
import entity.GiaiThua;
import entity.PhuongTrinhBacHai;
import entity.PhuongTrinhBacNhat;
import logic.Logic;

public class RunMain {
	/**
	 * method show ra những thông báo cho người dùng
	 */
	public static void message() {
		System.out.println("Bạn vui lòng chọn: ");
		System.out.println("Chọn 1 => Giải phương trình bậc nhất ");
		System.out.println("Chọn 2 => Giải phương trình bậc hai ");
		System.out.println("Chọn 3 => Tính giai thừa ");
		System.out.println("Chọn 4 => Tìm các số trong khoảng 20 - 200 chia hết cho 7"
				+ "nhưng không chia hết cho 5 ");
		System.out.println("Nếu muốn thoát hãy nhập khác từ 1 - 4 để thoát chương trình");
		System.out.println("---------------------------------------------------------------");
	}
	/**
	 * Hàm main run chương trình
	 * @param args
	 */
	public static void main(String[] args) {
		PhuongTrinhBacNhat phuongTrinhBacNhat = new PhuongTrinhBacNhat();
		PhuongTrinhBacHai phuongTrinhBacHai = new PhuongTrinhBacHai();
		GiaiThua giaiThua = new GiaiThua();
		FindListNumber findListNumber = new FindListNumber();
		Logic logic = new Logic();
		message();
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		while(input > 0 && input <= 4) {
			switch (input) {
			case 1:
				System.out.println("Giải phương trình ax + b = 0");
				System.out.print("Nhập a: ");
				phuongTrinhBacNhat.setValueFirst(scanner.nextFloat());
				System.out.print("Nhập b: ");
				phuongTrinhBacNhat.setValueSecond(scanner.nextFloat());
				if(phuongTrinhBacNhat.getValueFirst() == 0) {
					if(phuongTrinhBacNhat.getValueSecond() !=0) {
						System.out.println("Phương trình không tồn tại");
					} else {
						System.out.println("Phương trình vô số nghiệm");
					}
				} else {
					System.out.println("Phương trình có nghiệm: "
				                       +logic.giaiPTBacNhat(
				                    		   phuongTrinhBacNhat.getValueFirst(), 
				                    		   phuongTrinhBacNhat.getValueSecond()));
				}
				break;
				
			case 2:
				System.out.println("Giải phương trình ax2 + bx + c = 0");
				System.out.print("Nhập a: ");
				phuongTrinhBacHai.setValueFirst(scanner.nextFloat());
				System.out.print("Nhập b: ");
				phuongTrinhBacHai.setValueSecond(scanner.nextFloat());
				System.out.print("Nhập c: ");
				phuongTrinhBacHai.setC(scanner.nextFloat());
				String nghiemPT = logic.timNghiem(
						phuongTrinhBacHai.getValueFirst(),
						phuongTrinhBacHai.getValueSecond(),
						phuongTrinhBacHai.getC());
				System.out.println(nghiemPT);
				break;
			case 3:
				System.out.println("Tìm giai thừa");
				System.out.print("Nhập số cần tính giai thừa: ");
				giaiThua.setGiaiThua(scanner.nextInt());
				if(giaiThua.getGiaiThua() > 0) {
					System.out.println("Giai thừa là: "+logic.giaiThua(giaiThua.getGiaiThua()));
				} else {
					System.out.println("Không tồn tại giai thừa");
				}
				break;
			default:
				System.out.println("Tìm những số trong khoảng từ 20 -> 200 chia hết cho 7 và"
						+ " không chia hết cho 5");
				 findListNumber.setValueFirst(20);
				 findListNumber.setValueSecond(200);
				 findListNumber.setDivisible(7);
				 findListNumber.setNodivisible(5);
				 int numberStart = (int) findListNumber.getValueFirst();
				 int numberEnd = (int) findListNumber.getValueSecond();
				 int divisible = findListNumber.getDivisible();
				 int noDivisible = findListNumber.getNodivisible();
				 System.out.println(logic.listNumber(numberStart, numberEnd, divisible, noDivisible));
				break;
			}
			message();
			input = scanner.nextInt();
		}
		if(input < 1 || input > 4) {
			System.out.println("Bạn đã thoát chương trình.");
		}
	}

}
