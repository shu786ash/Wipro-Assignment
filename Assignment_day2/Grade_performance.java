package Assignment_day2;
import java.util.Scanner;
public class Grade_performance {
	public static void main(String args[]) {
	 Scanner sc = new Scanner(System.in);
     System.out.print("Enter grade: ");//A,B,C,D,E,F
     char grade = sc.next().charAt(0);
     switch(grade) {
         case 'A':
             System.out.println(" Excellent");
             break;
         case 'B':
             System.out.println("Good ");
             break;

         case 'C':
             System.out.println("Averag");
             break;

         case 'D':
             System.out.println("Poor");
             break;

         case 'F':
             System.out.println("Fail");
             break;
         default:
             System.out.println("Invalid grade");
     }
}
}
