package Collections_practice;
import java.util.*;
public class Prio_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q = new PriorityQueue<String>();
		q.add("Dahod");
		//q.add("Mumbai");
		q.add("Chennai");
		q.add("Ahmedabaad");//duplicate working 
		q.add("Mumbai");
		q.add("Pune");
		q.add("Bhopal");
		q.add("Ahmedabaad");
		//q.add("Bhopal");
		//q.add("Bhopal");
		System.out.println(q);
		q.remove();
		System.out.println(q);
		q.remove();
		System.out.println(q);
		q.remove("Mumbai");
		System.out.println(q);
		System.out.println(q.offer("Alpha"));
		System.out.println(q);
		System.out.println(q.peek());//retrieve
		System.out.println(q.poll());//retrieve and remove
		
		
		
		

	}

}
