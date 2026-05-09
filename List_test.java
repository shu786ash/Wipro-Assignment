package Collections_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_test {

	public static void main(String[] args) {
		int[] arr = {9, 8};
		List<Integer> list = new ArrayList<>();
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(5);
		list1.add(4);
		list.add(9);
		list.add(0);
		list.add(8);
		list.add(null);
		list.add(null);
		list.add(null);
		list.add(8);
		// list.add(80);
		
		System.out.println(list);
		System.out.println(list.indexOf(8));
		System.out.println(list.contains(9));
		System.out.println(list.isEmpty());
		System.out.println(list.lastIndexOf(null));
		list.remove((Integer)9);
		System.out.println(list);
		//list.remove(8);
		//System.out.println(list);
		System.out.println(list.get(2));
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		list.set(2, 10);
		System.out.println(list);
		System.out.println(list.reversed());
		
		
		
		

	}

}