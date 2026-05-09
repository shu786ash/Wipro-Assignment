package Assignment_day9;

import java.util.HashMap;

public class FirstNonRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "aabcbcde";
	        HashMap<Character, Integer> map = new HashMap<>();
	        for (char ch : str.toCharArray()) {
	            map.put(ch, map.getOrDefault(ch, 0) + 1);
	        }
	        char result = ' ';
	        for (char ch : str.toCharArray()) {
	            if (map.get(ch) == 1) {
	                result = ch;
	                break;
	            }
	        }
	        if (result != ' ') {
	            System.out.println("First non-repeating character: " + result);
	        } else {
	            System.out.println("Nocharacter found");
	        }
	}
}
