package assignment_Day1;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		System.out.print("Enter a Number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%2==0) {
			System.out.println(n+" is an Even Number");
		}
		else {
			System.out.println(n+" is a odd number");
		}
	}
}
