package Looping_Stmt.java;
import java.util.Scanner;
public class SumNat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a Number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i =1;
		int sum = 0;
		while(i <= n) {
			sum = sum+i;
			i++;
			
		}
		System.out.println("Sum of "+n+" natural numbers are: "+sum);

	}

}
