package Looping_Stmt.java;
import java.util.Scanner;
public class Test_While {
	public static void main(String args[]) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();;
//				while(a>10) {
//					System.out.println("a="+a);
//					a--;
//					
//				}
//				System.out.println("End of program");
		do {
			System.out.println("a= "+a);
			a--;
			
		}while(a>10);
	}

}
