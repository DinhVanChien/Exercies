package exception;

public class ValidateException {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public void inputNumberException() {
		this.setMessage("Vui lòng nhập giá trị là số");
		System.out.println(this.getMessage());
	}
	public void nullCustomerException() {
		this.setMessage("Không có khách hàng chờ phục vụ");
		System.out.println(this.getMessage());
	}
}
