//import java.util.*;
package control_statement;
import java.util.*;

public class ScannerPractice {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.println("Enter your age:");
	        int age = sc.nextInt();

	        if(age >= 18) {
	            System.out.println("Eligible for driving");
	        } else {
	            System.out.println("Not Eligible for driving");
	        }

	      

	}

}
