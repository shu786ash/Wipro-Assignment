package Assignment_day7;
import java.util.*;
public class SymmetricDiff{
	    public static void main(String[] args) {

	        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
	        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6));
	        HashSet<Integer> result = new HashSet<>();
	        for (Integer num : set1) {
	            if (!set2.contains(num)) {
	                result.add(num);
	            }
	        }
	        for (Integer num : set2) {
	            if (!set1.contains(num)) {
	                result.add(num);
	            }
	        }

	        System.out.println("Symmetric Difference: " + result);
	    }
	}

