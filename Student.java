package Object_class_method;

public class Student {

//	    // 1st method
//	    void details(int rollno, String name) {
//	        System.out.println("Rollno = " + rollno);
//	        System.out.println("Name = " + name);
//	    }
//
//	    // 2nd method (different order)
//	    void details(String name, int rollno) {
//	        System.out.println("Name = " + name);
//	        System.out.println("Rollno = " + rollno);
//	    }
//
//	    // 3rd method (extra parameter)
//	    void details(int rollno, String name, int age) {
//	        System.out.println("Rollno = " + rollno);
//	        System.out.println("Name = " + name);
//	        System.out.println("Age = " + age);
//	    }
//
//	    public static void main(String[] args) {
//
//	        Student stud = new Student();
//
//	        stud.details(101, "Nisha");          // method 1
//	        System.out.println("----------------");
//
//	        stud.details("Rahul", 102);          // method 2
//	        System.out.println("----------------");
//
//	        stud.details(103, "Aman", 20);       // method 3
//	    }
	      void patient(String name) {
	    	  System.out.println("Name: "+ name);
	    	  
	      }
	      void patient(String name , int age ) {
	    	  System.out.println("Name: "+ name);
	    	  System.out.println("Age : "+ age);
	      }
	      void patient(String name , int age,String department ) {
	    	  System.out.println("Name: "+ name);
	    	  System.out.println("Age : "+ age);
	    	  System.out.println("Department : "+ department);
	    	  
	      }
	
	public static void main(String args[]) {
		Student stud = new Student();
		stud.patient("ashish "); 
		  System.out.println("----------------");
        stud.patient("ashish ", 24);     
        System.out.println("----------------");
        stud.patient("Amit", 45, "Cardiology");
	}
	
	}

