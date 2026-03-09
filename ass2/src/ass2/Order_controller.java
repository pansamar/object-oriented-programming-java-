package ass2; 

public class Order_controller {
	public Order unnamed_Order;
	private double stored;

	public void get_Order_Details(String anOrderID) {
	} //den xreiazetai?
	
	public void checkForExistence(Order anOrder) {
		if (!Fruit.equals("Strawberry" || !Fruit.equals("Orange") || !Fruit.equals("Cherry") || !Fruit.equals("Mantarin")) {
			System.out.println("Try again, tis fruit doesn't existss");
		}
		if(Order_data.getQuantity() > stored) {
			System.out.println("Can't make the order. Smaller quantity");
		}
	}
}
