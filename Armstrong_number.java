package Assignment_day2;
import java.util.Scanner;
public class Armstrong_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int a = n;
        int sum = 0;
        while (n > 0) {
            int r = n % 10;
            sum = sum + (r * r * r);
            n = n / 10;
        }
        if (a == sum) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong");
        }

	}

}
