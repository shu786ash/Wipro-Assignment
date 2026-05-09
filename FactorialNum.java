package Looping_Stmt.java;
import java.util.Scanner;
public class FactorialNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		int fact = 1;
//		if(n==0) {
//			System.out.println("1");
//		}
		while(i<=n) {
			fact = fact * i;
			i++;
		}
		System.out.println("Factorial of a "+n+"  is: "+fact );
		
	}

}
