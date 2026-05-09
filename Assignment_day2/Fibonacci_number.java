package Assignment_day2;
import java.util.Scanner;
public class Fibonacci_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of terms: ");
        int n = sc.nextInt();
        int a = 0, b = 1;
        int i = 1;
        System.out.print("Series: ");
        while (i <= n) {
            System.out.print(a+" ");
            int c = a + b;
             a = b;
             b = c;
             i++;
        }
	}
}
