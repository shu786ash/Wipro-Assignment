package Assignment_day7;
import java.util.*;
public class SecondLargest {
	 public static void main(String[] args) {
	        List<Integer> list = Arrays.asList(10, 20, 4, 45, 99, 99);
	        Collections.sort(list);
	        int n = list.size();
	        int largest = list.get(n - 1);
	        int secondLargest = Integer.MIN_VALUE;
	        for (int i = n - 2; i >= 0; i--) {
	            if (list.get(i) != largest) {
	                secondLargest = list.get(i);
	                break;
	            }
	        }
	        if (secondLargest == Integer.MIN_VALUE) {
	            System.out.println("No element");
	        } else {
	            System.out.println("Second Largest element: " + secondLargest);
	        }
	    }
}
