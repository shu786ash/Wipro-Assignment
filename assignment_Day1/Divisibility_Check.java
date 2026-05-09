package assignment_Day1;
import java.util.Scanner;
public class Divisibility_Check {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter a number: ");
		        int n = sc.nextInt();
		        if(n % 5 == 0 && n % 11 == 0) {
		            System.out.println("Number is divisible by both 5 and 11");
		        } else {
		            System.out.println("Number is not divisible by both 5 and 11");
		        }
		    }
}

