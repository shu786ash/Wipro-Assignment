package Assignment_day2;
import java.util.Scanner;
public class FoodMenu {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("FOOD MENU:  ");
	        System.out.println(" Burger ");
	        System.out.println(" Pizza ");
	        System.out.println(" Momos ");
	        System.out.println(" Cold Coffee ");
	        System.out.print(" Enter item number: ");  
	        int itemNum = sc.nextInt();

	        switch (itemNum) {
	            case 1:
	                System.out.println("Burger");
	                System.out.println("PRICE-80");
	                break;
	            case 2:
	                System.out.println("Item: Pizza");
	                System.out.println("Price-120");
	                break;
	            case 3:
	                System.out.println("Item: Momos");
	                System.out.println("Price- 40");
	                break;
	            case 4:
	                System.out.println("Item: Cold Coffee");
	                System.out.println("Price- 100");
	                break;
	            default:
	                System.out.println("Invalid! choose 1-4.");
	        }
	        
	    }
	}


