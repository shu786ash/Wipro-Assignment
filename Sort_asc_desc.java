package Assignment_day3;
import java.util.Scanner;
public class Sort_asc_desc {
public static void main(String[] args) {
    System.out.println("How many numbers you want to take ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println("give the value ");
    int a[] = new int[n];
    for(int i = 0; i < n; i++) {
        a[i] = sc.nextInt();
    }
    for(int i = 0; i < n; i++) {
        for(int j = i+1; j < n; j++) {
            if(a[i] > a[j]) {
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
    }
    for(int i = 0; i < n; i++) {
        System.out.print(a[i] + " ");
    }
    System.out.println();
    for(int i = n-1; i >= 0; i--) {
        System.out.print(a[i] + " ");
    }
}

}
