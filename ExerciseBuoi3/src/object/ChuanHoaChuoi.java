package object;
/**
 * 
 * @author Đinh Văn Chiến
 *
 */
public class ChuanHoaChuoi {
	
	public String chuoi;
	
	public ChuanHoaChuoi() {
	}
	public void chuan(String strChuoi) {
		
	}
	/**
	 * 
	 * @param oneWord là chữ cần chuẩn hóa
	 * @return chữ sau khi đã chuẩn hóa kí tự đầu tiên viêt hoa các kí tự sau viết thường
	 */
	public String chuanHoa(String oneWord) {
		oneWord = String.valueOf(oneWord.charAt(0)).toUpperCase().concat(oneWord.substring(1).toLowerCase());
		return oneWord;
	}
	/**
	 * 
	 * @param chuanHoaChuoi chuỗi cần chuẩn hóa
	 * @return chuỗi đã chuẩn hóa
	 */
	public String chuanHoaChuoi(String inputChuoi) {
		StringBuilder stringBuilder = new StringBuilder();
		inputChuoi = inputChuoi.trim();
		String[] arrayChuoi = inputChuoi.split("\\s+");
        for (int i = 0; i < arrayChuoi.length; i++) {
        	stringBuilder.append(chuanHoa(arrayChuoi[i]));
            if (i < arrayChuoi.length - 1) {
            	stringBuilder.append(" ");
            }	
        }
		return stringBuilder.toString();
	}
	
}
