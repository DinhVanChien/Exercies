package Application;

import java.util.List;
import java.util.ArrayList;

import entity.Flight;
import entity.Passenger;
import logic.CalculaterTotalAmount;

public class RunMain {
	public static List<Passenger> listPassenger() {
		
		Flight flight = new Flight();
		flight.setFlightName("Hà Nội - Đà Nẵng");
		flight.setTimeFlight("21:00:00");
		CalculaterTotalAmount calculaterTotalAmount = new CalculaterTotalAmount();
		List<Passenger> listPassenger = new ArrayList<Passenger>();
		Passenger passenger1 = new Passenger();
		passenger1.setName("Tran Thi Màu");
		passenger1.setAge(28);
		passenger1.setGender("Nữ");
		passenger1.setTicketType("trung cấp");
		passenger1.setTotalTicket(1);
		passenger1.setFlight(flight);
		passenger1.setPayTotalAmount(calculaterTotalAmount.totalAmountPayPassenger(passenger1));
		listPassenger.add(passenger1);
		
		Passenger passenger2 = new Passenger();
		passenger2.setName("Tran Thi Mè");
		passenger2.setAge(5);
		passenger2.setGender("Nữ");
		passenger2.setTicketType("trung cấp");
		passenger2.setTotalTicket(1);
		passenger2.setFlight(flight);
		passenger2.setPayTotalAmount(calculaterTotalAmount.totalAmountPayPassenger(passenger2));
		listPassenger.add(passenger2);
		
		Passenger passenger3 = new Passenger();
		passenger3.setName("Chí Phèo");
		passenger3.setAge(30);
		passenger3.setGender("Nam");
		passenger3.setTicketType("cao cấp");
		passenger3.setTotalTicket(1);
		passenger3.setFlight(flight);
		passenger3.setPayTotalAmount(calculaterTotalAmount.totalAmountPayPassenger(passenger3));
		listPassenger.add(passenger3);
		
		return listPassenger;
	}
	
	public static void main(String[] args) {
		
		float totalAmount = 0;
		System.out.println("************** Thông tin hàng khách ****************");
		for(Passenger p : listPassenger()) {
			System.out.println("Tên hành khách: "+p.getName());
			System.out.println("Tuổi: "+p.getAge());
			System.out.println("Giới tính: "+p.getGender());
			System.out.println("Đi chuyến bay: "+p.getFlight().getFlightName());
			System.out.println("Thời gian bay: "+p.getFlight().getTimeFlight());
			System.out.println("Loại vé: "+p.getTicketType());
			System.out.println("Số lượng vé mua: "+p.getTotalTicket());
			System.out.println("Tổn tiền vé: "+p.getPayTotalAmount());
			totalAmount += p.getPayTotalAmount();
			System.out.println();
		}
		System.out.println("Tổng số tiền của chuyến bay là ");
		System.out.println(totalAmount);
	}
}
