package Assignment_day3;
import java.util.Scanner;
public class Palindrome_check {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insert number of elements into an array :  ");
        int n = sc.nextInt();
        System.out.println("enter array element: ");
        int a[] = new int[n];

    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
      int f = 0;
    for(int i=0;i<n/2;i++){
        if(a[i] != a[n-1-i]){
            f = 1;
            break;
        }
    }
    if(f==0) {
        System.out.println("this array is Palindrome");
    }
    else {
        System.out.println("this array is Not Palindrome");
    }
}
}
