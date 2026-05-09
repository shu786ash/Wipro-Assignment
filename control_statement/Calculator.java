package control_statement;
import java.util.Scanner;
public class Calculator {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter 1st number: ");
	        float a = sc.nextInt();
	        System.out.print("Enter 2nd number: ");
	        float b = sc.nextInt();
	        System.out.print("Enter operator: ");
	        int oper = sc.next().charAt(0);
	        switch(oper) {
	            case '+': System.out.print("Final Answer: " + (a + b));
	            break;
	            case '-': System.out.print("Final Answer: " + (a - b));
	            break;
	            case '*': System.out.print("Final Answer: " + (a * b));
	            break;
	            case '/': System.out.print("Final Answer: " + (a / b));
	            break;
	            default: System.out.print("Invalid");
	        }

	        
	    }
	}

