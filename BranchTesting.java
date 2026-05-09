package First_package;

public class BranchTesting {
	
	static void intro()
	{
		System.out.println("\tName: Ashish Shukla");
		System.out.println("\tGraduated in BTech from GLA University");
	}
	void technical()
	{
		System.out.println("\tI am good in Java, Full stack ");
	}
	
	public static void main(String args[]) {
		System.out.println("Intro:->");
		intro();
		BranchTesting fs = new BranchTesting();
		fs.technical();
	}

}
