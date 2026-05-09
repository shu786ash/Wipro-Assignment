package control_statement;

public class Multipleconditions {

	public static void main(String[] args) {
		float per = 100f;
		 if(per >100 || per < 0) {
	            System.out.println("Invalid Input");
	        }
		else if(per >= 75) {
		    System.out.println("Dist");
		}
		else if(per >= 60) {
		    System.out.println("First class");
		}
		else if(per >= 50) {
		    System.out.println("Second class");
		}
		else if(per >= 40) {
		    System.out.println("Pass class");
		}
		else {
		    System.out.println("Fail");
		}

	}

}
