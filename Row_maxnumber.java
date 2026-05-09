package Assignment_day3;
import java.util.Scanner;
public class Row_maxnumber {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter row:::: ");
	        int r = sc.nextInt();
	        System.out.println("Enter column:::: ");
	        int c = sc.nextInt();
	        System.out.println("Enter Row and Column elemts ");
	        int a[][] = new int[r][c];
	        for(int i = 0; i < r; i++) {
	            for(int j = 0; j < c; j++) {
	                a[i][j] = sc.nextInt();
	            }
	        }
	        for(int i = 0; i < r; i++) {
	            int max = a[i][0];
	            for(int j = 1; j < c; j++) {
	                if(a[i][j] > max) {
	                    max = a[i][j];
	                }
	            }
	            System.out.println(max);
	        }
	    }
	}


