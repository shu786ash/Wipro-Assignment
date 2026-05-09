package Poly_practice;

abstract class Hospital {

    abstract void documents();
    abstract void patients();

    void ot() {
        System.out.println("Operation theatre available");
    }

    void operations() {
        System.out.println("Operations are going on");
    }
}

class Nurse extends Hospital {

    void documents() {
        System.out.println("Nurse handles documents");
    }

    void patients() {
        System.out.println("Nurse takes care of patients");
    }
}

class Doctor extends Hospital {

    void documents() {
        System.out.println("Doctor checks reports");
    }

    void patients() {
        System.out.println("Doctor treats patients");
    }
}
public class Hospital_test {
	 public static void main(String[] args) {

	        Nurse n = new Nurse();
	        n.documents();
	        n.patients();
	        n.ot();
	        n.operations();

	        System.out.println("-----");

	        Doctor d = new Doctor();
	        d.documents();
	        d.patients();
	        d.ot();
	        d.operations();
	    }
}
