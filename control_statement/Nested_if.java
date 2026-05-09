package control_statement;

public class Nested_if {

	public static void main(String[] args) {
		 float per = 65f;
	        if(per > 100 || per < 0) {
	            System.out.println("Invalid Input");
	        }
	        else if(per >= 75 && per <= 100) {

	            System.out.println("Dist");

	            if(per >= 85) { 
	                System.out.println("A+");

	                if(per >= 95) { // Level 3
	                    System.out.println("A++");
	                }
	            }
	        }
	        else if(per>=60 && per<75) {
	        	System.out.println("first class");
	        }
	        else if(per>=50 && per<60) {
	        	System.out.println("second class");
	        }
	        else {
	        	System.out.println("fail");
	        }
	}

}
