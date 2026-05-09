package Collections_practice;
import java.util.*;
public class Deq {
	public static void main(String[] args) {
		Deque<String> q = new ArrayDeque<String>();
		q.add("Dahod");
		q.add("Chennai");
		q.add("Ahmedabaad");
		q.add("Mumbai");
		q.add("Pune");
		q.add("Bhopal");
		//q.add("Dahod");
		q.add("Ahmedabaad");
		System.out.println(q);
		System.out.println(q.getFirst());
		System.out.println(q.getLast());
		System.out.println(q.peek());
		System.out.println(q.peekFirst());
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.pop());
		//System.out.println(q);
		System.out.println(q.remove("Mumbai"));
		System.out.println(q);
		System.out.println(q.reversed());
		
		
	}

}
