package Poly_practice;

// 1. Interface (The Rules)
interface Hospital {
    void infra();      // Abstract method
    void degree();     // Abstract method

    default void doc() {
        System.out.println("Hello from Hospital Default Doc Method");
    }
}

// 2. Doctor Class (Implementation)
class Doctor implements Hospital {
    @Override
    public void infra() {
        System.out.println("Ots, wards, doctor cabin");
    }

    @Override
    public void degree() {
        System.out.println("MD Endo");
    }
}

// 3. Nurse Class (Implementation)
class Nurse implements Hospital {
    @Override
    public void infra() {
        System.out.println("Ots, wards, nurse cabin, general area");
    }

    @Override
    public void degree() {
        System.out.println("Nurse Degree/Diploma");
    }
}

// 4. Main Class (Execution)
public class Inter_face {
    public static void main(String[] args) {
        
        // Doctor testing
        Doctor d = new Doctor();
        System.out.println("--- Doctor Section ---");
        d.infra();
        d.degree();
        d.doc(); 

        System.out.println(); // Line break

        // Nurse testing
        Nurse n = new Nurse();
        System.out.println("--- Nurse Section ---");
        n.infra();
        n.degree();
        n.doc(); 
    }
}