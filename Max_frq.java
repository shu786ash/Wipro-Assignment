package Assignment11;

import java.util.*;

public class Max_frq {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 2, 4, 2, 5, 1, 1, 1};

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        int maxElement = 0;

        // Find maximum frequency
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                maxElement = entry.getKey();
            }
        }

        System.out.println("Element with maximum frequency: " + maxElement);
        System.out.println("Frequency of that elemnt " + maxFreq);
    }
}