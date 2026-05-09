package Assignment11;

import java.util.*;

public class Sort_map{
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(3, "Java");
        map.put(1, "Python");
        map.put(2, "C++");

        // Sort by keys
        TreeMap<Integer, String> sortedMap = new TreeMap<>(map);

        System.out.println(sortedMap);
    }
}
