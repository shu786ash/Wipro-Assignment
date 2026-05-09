package Assignment_day2;
import java.util.Scanner;
public class Access_permission {
	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Select Role:\n1. Admin\n2. User\n3. Guest");
		        System.out.print("Enter choice: ");      
		        int choice = sc.nextInt();

		        if (choice == 1) {
		            System.out.println("Role: Admin");
		            System.out.println("Full Access ");
		        } 
		        else if (choice == 2) {
		            System.out.println("User");
		            System.out.println("Limited Access");
		        } 
		        else if (choice == 3) {
		            System.out.println("Guest");
		            System.out.println("Restricted Access");
		        } 
		        else {
		            System.out.println("Invalid chpice");
		        }
		    }
		}

	


