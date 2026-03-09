package ass2;

import java.util.ArrayList;

//αυτή η κλάση αφορά τις πωλήσεις όχι τις αγρές. 
public class Order {
	private int ID;
	//private String date;
	private ArrayList<Order_data> orders = new ArrayList<Order_data>();

	/*	public Order_controller anOorder_controller;
	public Orders_catalog anOrder_catalog;*/
	private Customer cus;
	
	public Order(int ID, ArrayList<Order_data> orders, Customer cus) {
		this.ID = ID;
		this.orders = orders;
		this.orders = orders;
		this.cus = cus;
	}
	
	 
	public  void printData(Order anOrder) {
		System.out.println(anOrder.ID);
		Order_data.get_data(orders);
		System.out.println(anOrder.cus);
	}
	
	
	private String typeP;  //P for Purchase
	private int quantityP;
	private int order_limitsP;
	private double price;

	public Order(String typeP, int quantityP, double price) {
		this.typeP = typeP;
		
		if(quantityP > order_limitsP) {
			System.out.println("Can't make the order, please give a smaller quantity");
			break;
		}
		this.quantityP = quantityP;
		this.price = price;
	}
}
