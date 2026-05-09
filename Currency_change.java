package Assignment_day2;
import java.util.Scanner;
public class Currency_change {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Currency Change: ");
        System.out.println("1. inr to dollor");
        System.out.println("2. inr to euro");
        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();
        System.out.print("Enter Amount in Rupees: ");
        float inr = sc.nextInt();
        if (choice == 1) {
            float usd = inr / 94; 
            System.out.println("Rupees in Dollor: " + usd);
        } 
        else if (choice == 2) {
            float eur = inr / 102; 
            System.out.println("Rupees in Euro: " + eur);
        } 
        else {
            System.out.println("Invalid Choice");
        }
	        
	    }
	}

