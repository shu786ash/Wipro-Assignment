package assignment_Day1;
import java.util.Scanner;
public class NumberSignCheck {
	public static void main(String args[]) {
		System.out.print("Enter a Number: ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
//		if(n>0) {
//			System.out.println(n+" is a positive number ");
//		}
//		else if(n==0) {
//			System.out.println(n+" is Neither Positive Nor Negative");
//		}
//		else {
//			System.out.println(n+" is a negative number");
//		}
		if(age >= 18) {
            System.out.println("Eligible for voting");
        } else {
            System.out.println("Not eligible for voting");
        }
		sc.close();
	}

}
