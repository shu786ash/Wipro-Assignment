package Assignment11;
import java.util.*;

public class Remove_dupl{
    public static void main(String[] args) {

        String str = "programming";

        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for (char ch : str.toCharArray()) {
            set.add(ch);
        }

        String result = "";
        for (char ch : set) {
            result += ch;
        }

        System.out.println(result);
    }
}