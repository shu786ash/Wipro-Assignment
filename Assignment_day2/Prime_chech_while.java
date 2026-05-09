package Assignment_day2;
import java.util.Scanner;
public class Prime_chech_while {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		  Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int i = 2;
	        int count = 0;
	        while(i < n) {
	            if(n % i == 0) {
	                count++;
	                break;
	            }
	            i++;
	        }
	        if(n <= 1) {
	            System.out.println("Not Prime");
	        }
	        else if(count == 0) {
	            System.out.println("Prime");
	        }
	        else {
	            System.out.println("Not Prime");
	        }
	}
}
