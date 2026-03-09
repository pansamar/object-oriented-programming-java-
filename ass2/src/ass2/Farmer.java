package ass2;

import java.util.ArrayList;

public class Farmer {
	private  String name;
	private  String contact_info;
	private  String date;
	public  ArrayList<Order> aFarmers_catalog = new ArrayList<Order>();;
	
	
	public Farmer(String name, String contact_info,String date) { //prosthiki kataskeyavsti
		this.name = name;
		this.contact_info = contact_info;
		this.date = date;
	}
	
	public void addOrder(String type, int quantity, double price) {
		aFarmers_catalog.add(new Order(type,quantity,price));
	}
	
	
	public   void printFarmer(Farmer aFarmer) {
		System.out.println("Name: " + aFarmer.name + "Contact info" + aFarmer.contact_info + "Date:" + aFarmer.date);
		Farmers_catalog.printCatalog(aFarmers_catalog);
		
	}

}
