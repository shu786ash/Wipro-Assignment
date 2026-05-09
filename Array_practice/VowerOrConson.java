package Array_practice;
import java.util.Scanner;
public class VowerOrConson {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ab = sc.next().charAt(0);
        switch (ab) {
            case 'a': case 'e': case 'i': case 'o': case 'u':
            case 'A': case 'E': case 'I': case 'O': case 'U':
                System.out.println("Vowel");
                break;
            default:
                if ((ab >= 'a' && ab <= 'z') || (ab >= 'A' && ab <= 'Z')) {
                    System.out.println("Consonant");
                } else {
                    System.out.println("Invalid input");
                }
        }

	}

}
