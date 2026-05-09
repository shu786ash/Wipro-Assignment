package Collections_practice;
import java.util.ArrayList;
import java.util.Scanner;
public class List_arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		int num = sc.nextInt();
		if(list.contains(num)) {
			System.out.println("number found");
		}
		else {
			System.out.println("number not found");
		}
		sc.close();

	}
	

}
