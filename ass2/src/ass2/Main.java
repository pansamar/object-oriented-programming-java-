package ass2;


public class Main {

	public static void main(String[] args) {
		
		Order order1 = new Order(123456789,"Strawberry",50, "Orange", 50, customer1);
		Orders_catalog.addOrder(order1);
		System.out.println("Order 1 haw been added succesfully!");
		Order order2 = new Order(123456789,"Mantarin", 120, "Orange", 45, customer1);
		Orders_catalog.addOrder(order2);
		System.out.println("Order 2 haw been added succesfully!");
		Order order3 = new Order(123456780,"Cherry",80, "Orange", 35, "Strawberry", 28, customer2);
		Orders_catalog.addOrder(order3);
		System.out.println("Order 3 haw been added succesfully!");
		Order order4 = new Order(123456780,"Mantarin",60, customer2);
		Orders_catalog.addOrder(order4);
		System.out.println("Order 4 haw been added succesfully!");

		
		Orders_catalog.removeOrder(order2);
		System.out.println("Order 2 haw been removed succesfully!");
		
		Order.printData(order1);

	}

}
