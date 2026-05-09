package Assignment_day3;
import java.util.Scanner;

public class Remove_dup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many number you want to insert: ");
        int n = sc.nextInt();
        System.out.println("Enter number here: ");
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int ct = 0;
            for(int j=0;j<i;j++){
                if(a[i]==a[j]){
                    ct++;
                }
            }
            if(ct==0){
                System.out.print(a[i]+" ");
            }
        }
    }
}