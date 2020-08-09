package logic;
import entity.Passenger;

public class CalculaterTotalAmount {
	
	public float totalAmountPayPassenger(Passenger passenger) {
		String ticketType = passenger.getTicketType();
		float priceTicket =  0;
		switch (ticketType) {
		case "cao cấp":
			priceTicket = 10000;
			break;
		case "thương gia":
			priceTicket = 5000;
			break;
		case "trung cấp":
			priceTicket = 2000;
			break;
		}
		
		float totalAmount = passenger.getTotalTicket() * priceTicket;
		
		boolean checkDiscount = false;
		if(passenger.getTicketType().equals("trung cấp") 
				&& passenger.getAge() > 0 && passenger.getAge() < 6 ) {	
			totalAmount = passenger.getTotalTicket() * priceTicket * 0.8f;
			checkDiscount = true;
		}
		
		String timeFlight = passenger.getFlight().getTimeFlight();
		String[] time = timeFlight.split(":");
		if((Integer.parseInt(time[0]) >= 20 && Integer.parseInt(time[0]) < 24)
				|| (Integer.parseInt(time[0]) >= 0 && Integer.parseInt(time[0]) < 4)) {
			if(checkDiscount) {
				totalAmount *= 0.5f;
			} else {
				totalAmount = passenger.getTotalTicket() * priceTicket * 0.5f;	
			}
		}
		return totalAmount;
	}
}
