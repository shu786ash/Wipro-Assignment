package Assignment_day2;
import java.util.Scanner;
public class Even_Or_Add {
	public static void main(String args[]) {
	 Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     switch(a % 2) {
         case 0:
        	 System.out.println("Even"); 
         break;
         case 1: 
         case -1: 
        	 System.out.println("Odd");
        	 break;
     }

}
}