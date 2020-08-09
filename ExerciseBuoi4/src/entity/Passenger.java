package entity;
/*
 * Họ tên, giới tính, tuổi, tên chuyến bay, thời gian bay, số lượng vé khách mua, tiền vé khách phải trả
Cuối cùng, chương trình in ra tổng tiền thu được từ chuyến bay

 */
public class Passenger {
	private String name;
	private int age;
	private String gender;
	private int totalTicket;
	private Flight flight;
	private String ticketType;
	private float payTotalAmount;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getTotalTicket() {
		return totalTicket;
	}
	public void setTotalTicket(int totalTicket) {
		this.totalTicket = totalTicket;
	}
	public float getPayTotalAmount() {
		return payTotalAmount;
	}
	public void setPayTotalAmount(float payTotalAmount) {
		this.payTotalAmount = payTotalAmount;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public String getTicketType() {
		return ticketType;
	}
	
	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}
	public Passenger(String name, int age, String gender, int totalTicket,  Flight flight,
			String ticketType, float payTotalAmount) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.totalTicket = totalTicket;
		this.flight = flight;
		this.ticketType = ticketType;
		this.payTotalAmount = payTotalAmount;
	}
	public Passenger() {
		super();
	}
	
}
