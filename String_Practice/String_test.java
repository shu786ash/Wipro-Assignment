package String_Practice;

public class String_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       // String str = "Hello";                    // 1 object (SCP)
//        String str1 = new String("Welcome");     // 2 objects (Heap + SCP)
//        String str2 = new String("Hello");       // 2 objects (Heap + SCP reuse)
//
//        // concat (String is immutable)
//        String st = str.concat(" " + str2);
//
//        System.out.println(st);
        StringBuffer sb = new StringBuffer("Welcome");
        System.out.println(sb);   // Welcome
        // append (modify same object)
        sb.append(" Raj");
        System.out.println(sb);   // Welcome Raj
      
	}

}
