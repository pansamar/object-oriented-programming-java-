package ass2;

import java.util.ArrayList;

public class Order_data {
	private String type;
	private double quantity;
	
	private String typeForPurchase;
	private double quantityForPurchase;
	private Farmer aFarmer;
	
	public Order_data(String type, double quantity) {
		this.type = type;
		this.quantity = quantity;		
	}
	
	public Order_data(String typeForPurchase, double quantityForPurchase, Farmer aFarmer) {
		this.typeForPurchase = typeForPurchase;
		this.quantityForPurchase = quantityForPurchase;
		this.aFarmer = aFarmer;
	}
	
	public void fill_data(Order anOrder) {
		
	}

	public void continue_65() { //den xreiazetai?
	}
	
	 String getOrderType(ArrayList anOrder) { //nea methodos
		return type;
	}
	 double getQuantity(ArrayList anOrder) {  //nea methodos
		return quantity;
	}
	public void get_data(ArrayList anOrder) {  //nea methodos
		getOrderType(anOrder);
		getQuantity(anOrder);
	}
	
	 String getTypeP(ArrayList anOrder) {    //P for Purchase   nea methodos
		return typeForPurchase;
	}
	 double getQuantityP(ArrayList anOrder) { //nea methodos
		return quantityForPurchase;
	}
	 void returnFarmer(Farmer aFarmer) {  //nea methodos
		aFarmer.printFarmer(aFarmer);
	}
	 void get_dataP(ArrayList anOrder) {  //nea methodos
		getTypeP(anOrder);
		getQuantityP(anOrder);
	}
	
}
