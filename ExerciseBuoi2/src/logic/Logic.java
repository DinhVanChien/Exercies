package logic;
/**
 * 
 * @author Đinh Văn Chiến
 * 
 */
public class Logic {
	/**
	 * method giải phương trình bậc nhất ax + b = 0
	 * @param a là biến a trong pt ax + b = 0
	 * @param b là biến b trong pt ax + b = 0
	 * @return nghiệm phương trình
	 */
	public float giaiPTBacNhat(float a, float b) {
		return b == 0 ? 0 : -b/a;
	}
	
	/**
	 * Method tinh delta PT bậc hai ax2 + bx + c = 0
	 * @param a giá bị biến a trong pt ax2 + bx + c = 0
	 * @param b giá bị biến b trong pt ax2 + bx + c = 0
	 * @param c giá bị biến c trong pt ax2 + bx + c = 0
	 * @return kết quả detal
	 */
	public float detal(float a, float b, float c) {
		return (b*b) - (4*a*c);
	}
	
	/**
	 * Method giải phương trình bậc hai ax2 + bx + c = 0
	 * @param a giá bị biến a trong pt ax2 + bx + c = 0
	 * @param b giá bị biến b trong pt ax2 + bx + c = 0
	 * @param detal giá trị detal
	 * @return nghiệm phương trình
	 */
	public String timNghiem(float a, float b, float c){
		float detal = this.detal(a, b, c);
		if(detal < 0) {
			return "Phương trình vô nghiệm";
		} else if(detal == 0 ) {
			return "Phương trình có nghiệm kép: x1 = x2 = " + -b/(2*a);
		} 
		return  "Phương trình có nghiệm kép: x1 = " + (-b - Math.sqrt(detal)) / a + 
				" x2 = " + (-b + Math.sqrt(detal)) / a;
	}
	
	/**
	 * Method tính giai thừa
	 * @param number là số cần tính giai thừa
	 * @return kết quả giai thừa
	 */
	public int giaiThua(int number) {
		int result = number;
			while(number > 1) {
				result = result * (number - 1);
				--number;
			}
		return result;
	}
	
	/**
	 * Method tìm ra các số chia hết cho 7 nhưng ko chia 
	 * hết cho 5 trong khoảng 20 - 200
	 * @param start số bắt đầu trong 1 khoảng vd 20 - 200 => start = 20
	 * @param end số kết thúc trong 1 khoảng vd 20 - 200 => end = 200
	 * @param divisible số chia hết
	 * @param noDivisible số không chia hết
	 * @return list các số chia hết cho divisible ko chia hết cho noDivisible
	 */
	public String listNumber(int start, int end, int divisible, int noDivisible) {
		String listNumber = "";
		int temp = start % divisible;
		start += (divisible - temp);
		for(int i = start; i <= end; i += divisible) {
			if(i % divisible == 0 && i % noDivisible != 0) {
				listNumber = listNumber.concat(i+" ");
			}
		}
		return listNumber.trim();
	}
}
