package Assignment_day7;
import java.util.*;
public class Common_elements {
	public static void main(String[] args) {

        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));
        HashSet<Integer> result = new HashSet<>();
        for (Integer num : set1) {
            if (set2.contains(num)) {
                result.add(num);
            }
        }
        System.out.println("Common Elements: " + result);
    }
}
