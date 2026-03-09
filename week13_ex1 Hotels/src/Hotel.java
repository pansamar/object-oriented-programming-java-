import java.io.Serializable;
import java.util.ArrayList;


public class Hotel implements Serializable {
	
	private String name;

	private ArrayList<Booking> bookings = new ArrayList<>();
	
	public Hotel(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void addBooking(Booking abooking){
		bookings.add(abooking);
	}
	public double totalCost(){
		double total = 0;
		for(Booking b: bookings){
			total += b.getCost();
		}
		return total;
	}
	@Override
	public String toString(){
		return name;
	}
}
