package Assignment11;
import java.util.*;
public class First_non_characte {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Find first non-repeating
        char result = ' ';
        boolean found = false;

        for (char ch : str.toCharArray()) {
            if (map.get(ch) == 1) {
                result = ch;
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found");
        }

        sc.close();
    }

}
