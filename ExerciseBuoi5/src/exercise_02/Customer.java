package exercise_02;

public class Customer extends Person{
	private int cmt;
	
	public Customer(String name, int cmt) {
		super(name);
		this.cmt = cmt;
	}
	
	public Customer() {
		super();
	}

	public int getCmt() {
		return cmt;
	}

	public void setCmt(int cmt) {
		this.cmt = cmt;
	}
	
	public void printCustomer() {
		System.out.println("Khách hàng "+this.getName() +" đã được phục vụ");
	}
}
