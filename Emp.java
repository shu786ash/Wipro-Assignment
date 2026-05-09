package Keywords_practice;

public class Emp {
	static class Innerclass
	{
		void testt()
		{
			System.out.println("Inner class Method");
		}	
	}
	int empid;
    String name;
    static String companyname = "Wipro";

    void show(int empid1, String name1) {

        empid = empid1;
        name = name1;

        System.out.println("empid " + empid);
        System.out.println("name " + name);
        System.out.println("companyname " + companyname);
    }
    static void details(int empid1, String name1) {
        System.out.println("empid= " + empid1);
        System.out.println("name= " + name1);
        System.out.println("companyname= " + companyname);
    }
    {
    	System.out.println("HELLO! GUYS");
    }
    
    static {
    	System.out.println("HELLO! GUYS");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp emp = new Emp();

        emp.show(101, "Rohit");
        emp.show(102, "Soham");
        emp.show(103, "Mohan");
      //show(103, "Mohan");
        // static method call
        details(101, "Rohit");
        Emp.Innerclass test=new Innerclass();
		test.testt();

	}

}
