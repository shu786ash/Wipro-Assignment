package control_statement;
import java.util.Scanner;
public class LargestNum {

	public static void main(String[] args) {
		System.out.println("Enter Three Number:  ");
		Scanner sc = new Scanner(System.in);
		System.out.println("First number a:  ");
		        int a = sc.nextInt();
		        System.out.println("Second number b:  ");
		        int b = sc.nextInt();
		        System.out.println("Third number c:  ");
		        int c = sc.nextInt();
		        if(a >= b && a >= c) {
		            System.out.println("a is largest: " + a);
		        }
		        else if(b >= a && b >= c) {
		            System.out.println("b is largest: " + b);
		        }
		        else {
		            System.out.println("c is largest: " + c);
		        }

	}

}
