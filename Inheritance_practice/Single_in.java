package Inheritance_practice;

//class Animal{//paremt class / base class/ super class
//	void eat(String eat) {
//		System.out.println("Eat = "+eat);
//	}
//	void sound(String sd) {
//		System.out.println("Sound = "+sd);
//	}
//}
//class Dog extends Animal{//child class / sub class / extended class
//	void color() {
//		System.out.println(" Black");
//	}	
//	
//}
//class Cat extends Animal{
//	void walk() {
//		System.out.println("Cat Walk");
//	}
//	
//}

//recoommended to use or create object for child class

// CREATE PARENT CHILD RELATIONSHIP BETWEEN HOSPITAL AND DOCTOR
class Hospital {
 String hName = "Medanta Hospital";
 void hospitalLocation() {
     System.out.println("Delhi");
 }
}
class Doctor extends Hospital {
 String doctorName = "Dr.Amit";
 String dept = "Cardiologist";

 void displayDetails() {
     System.out.println("Hospital: " + hName); 
     System.out.println("Doctor Name: " + doctorName);
     System.out.println("Department: " + dept);
 }}
public class Single_in {
	public static void main(String[] args) {
		Doctor doc = new Doctor();
	     doc.hospitalLocation(); 
	     doc.displayDetails();
//		Dog d = new Dog();
//		d.color();
//		d.eat("Royal canin");
//		d.sound("Barking");
//		//d.walk();
//		Cat c = new Cat();
//		c.walk();
		
		

	}

}
