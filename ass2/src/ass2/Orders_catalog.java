package ass2;

import java.util.ArrayList;

public class Orders_catalog { 

	public static ArrayList<Order> allOrders = new ArrayList<Order>();

	public void get_data(ArrayList<Order_data> anOrder) {
		System.out.println(allOrders);
	}

	public static void addOrder(Order anOrder) { //metonomasia klasis
		allOrders.add(anOrder);	
	}

	public void search_order(Order anOrder) {
	} //den xreiazetai?
	
	public static void removeOrder(Order anOrder) {  //kainourgia klasi
		allOrders.remove(anOrder);
	}
}
