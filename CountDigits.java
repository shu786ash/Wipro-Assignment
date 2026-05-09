package Assignment_day2;
import java.util.Scanner;
public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number: ");
	        int num = sc.nextInt();
	        int count = 0;
	        while (num != 0) {
	            num = num / 10;
	            count++;
	        }
	        System.out.println("Total digits: " + count);

	}

}
