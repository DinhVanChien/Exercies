package Application;

import java.util.List;
import java.util.ArrayList;

import entity.Flight;
import entity.Passenger;
import logic.CalculaterTotalAmount;

public class RunApplication {
	
	public static List<Passenger> listPassenger() {
		Flight flight = new Flight();
		flight.setFlightName("Hà Nội - Đà Nẵng");
		flight.setTimeFlight("21:00:00");
		
		List<Passenger> listPassenger = new ArrayList<Passenger>();
		Passenger passenger1 = new Passenger();
		passenger1.setName("Tran Thi Màu");
		passenger1.setAge(28);
		passenger1.setGender("Nữ");
		passenger1.setTicketType("trung cấp");
		passenger1.setTotalTicket(1);
		passenger1.setFlight(flight);
		listPassenger.add(passenger1);
		
		Passenger passenger2 = new Passenger();
		passenger2.setName("Tran Thi Mè");
		passenger2.setAge(5);
		passenger2.setGender("Nữ");
		passenger2.setTicketType("trung cấp");
		passenger2.setTotalTicket(1);
		passenger2.setFlight(flight);
		listPassenger.add(passenger2);
		
		Passenger passenger3 = new Passenger();
		passenger3.setName("Chí Phèo");
		passenger3.setAge(30);
		passenger3.setGender("Nam");
		passenger3.setTicketType("cao cấp");
		passenger3.setTotalTicket(1);
		passenger3.setFlight(flight);
		listPassenger.add(passenger3);
		
		return listPassenger;
	}
	
	public static void main(String[] args) {
		
		CalculaterTotalAmount calculaterTotalAmount = new CalculaterTotalAmount();
		System.out.println("************** Thông tin hàng khách ****************");
		for(Passenger p : listPassenger()) {
			System.out.println("Tên hành khách: "+p.getName());
			System.out.println("Tuổi: "+p.getAge());
			System.out.println("Giới tính: "+p.getGender());
			System.out.println("Đi chuyến bay: "+p.getFlight().getFlightName());
			System.out.println("Thời gian bay: "+p.getFlight().getTimeFlight());
			System.out.println("Loại vé: "+p.getTicketType());
			System.out.println("Số lượng vé mua: "+p.getTotalTicket());
			System.out.println("Tổn tiền vé: "+calculaterTotalAmount.totalAmountPayPassenger(p));
			System.out.println();
		}
		System.out.println("Tổng số tiền của chuyến bay là ");
		System.out.println(calculaterTotalAmount.totalAmountFlight(listPassenger()));
	}
}
