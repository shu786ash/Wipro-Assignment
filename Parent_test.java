package Keywords_practice;
	class Parent {

	    int x = 100;
	    void culture() {
	    	System.out.println("Indian Culture");
	    }
	    Parent(){
	    	
	    }

//	    void pa() {
//	        System.out.println("Parent class method");
//	    }
	}

	class Child extends Parent {
		
		Child(){
			super();
		}
          
	    int x = 10;

	    void show() {
	    	//super();
	    	//super.culture();
	    	System.out.println("Western Culture");

	      //  System.out.println("Child class value of x = " + x);

	        // using super keyword
	      //  System.out.println("Parent class value of x = " + super.x);

	        // calling parent method
	       // super.pa();
	    }
	}

	public class Parent_test {

	    public static void main(String[] args) {

	        Child c = new Child();
	        c.show();
	    }
	}

