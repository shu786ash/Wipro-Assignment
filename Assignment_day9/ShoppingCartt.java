package Assignment_day9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCartt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Map<String, Double> productMap = new HashMap<>();
	        productMap.put("laptop", 5000.0);
	        productMap.put("obile", 2000.0);
	        productMap.put("headphones", 200.0);
	        productMap.put("mouse", 500.0);
	        List<String> cart = new ArrayList<>();
	        cart.add("laptop");
	        cart.add("mouse");
	        cart.add("headphones");
	        double total = 0;
	        for (String item : cart) {
	            total += productMap.get(item);
	        }
	        System.out.println("Items in Cart: " + cart);
	        System.out.println("Total Price: " + total);
	}
}
