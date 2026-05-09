package Object_class_method;

public class Animal {
	 void sound(String animalName, String sound) {
	        System.out.println("Animal name: " + animalName);
	        System.out.println("Animal sound: " + sound);
	    }

	    // method without parameter
	    void show() {//no argument method
	        System.out.println("This is show method");
	    }

	    public static void main(String[] args) {

	        Animal dog = new Animal();
	        dog.sound("Max", "Barking");

	        System.out.println("------------------------------");

	        Animal cat = new Animal();
	        cat.sound("Kitty", "Meowww");
	        cat.show();
}
}