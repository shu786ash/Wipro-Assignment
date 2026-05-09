package Collections_practice;
// ********hashset*********
// elements store on the basis of hash code value
//doesn't follow insertion order
//single null is allowed to store
//duplicate is not allowed
//*********treeset*************
// elements store on the basis of hash code value
//follow ascending order
// single null not allowed
// duplicate not allowed
import java.util.*;
import java.util.Set;
import java.util.TreeSet;
public class HAsh_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set<String> set = new HashSet<String>();
		//Set<String> set = new LinkedHashSet<String>();
		Set<String> set = new TreeSet<String>();
		set.add("Orange");
		set.add("Mango");
		set.add("Kiwi");
		set.add("Apple");
		//set.add(null);
		//set.add(null);	
		  System.out.println(set);
		  System.out.println(set.equals("Orange"));//false
		  set.remove("Kiwi");
		  System.out.println(set);
		  Iterator<String> itr = set.iterator();
		  while(itr.hasNext()) {
			  System.out.println(itr.next());
		  }
	}

}
