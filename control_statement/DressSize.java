package control_statement;
import java.util.Scanner;
public class DressSize {
	    public static void main(String[] args) {
	    	System.out.print("Enter Dress Size:\n");
	    	Scanner sc = new Scanner(System.in);
	        int size = sc.nextInt();;

	        switch(size) {
	            case 26: System.out.println("Extra Small");
	                break;
	            case 28: System.out.println("Small");
	                break;
	            case 30: System.out.println("Medium");
	                break;
	            case 32: System.out.println("Large");
	                break;
	            case 34:
	                System.out.println("Extra Large");
	                break;

	            default:
	                System.out.println("Invalid size");
	        }
	    }
}

