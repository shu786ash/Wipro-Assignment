package Keywords_practice;

class Ani {
    int x = 100; // Class Level Variable (Instance Variable)
    String name, type;

    // Method 1: Sets values using 'this'
    void eat(int x, String name, String type) {
        this.x = x;           // 'this.x' refers to line 4, 'x' refers to the parameter in line 7
        this.name = name;      
        this.type = type;      
        System.out.println("X= " + x);
        System.out.println("name= " + name);
        System.out.println("type= " + type);
    }

    // Method 2: Calls Method 1 internally
    void details() {
        this.eat(100, "Max", "Dog"); // 'this' calls the 'eat' method of the current object
    }
    Ani() 
    {
        // Yahan aap 'this' likh rahe hain (Cursor line 21 par hai)
        System.out.println("Default constructor");
    }

    // Parameterized Constructor (Line 24)
    Ani(int a) 
    {
        this(); // Yeh Default Constructor (line 19) ko call karega
    }
}

public class Animal {
    public static void main(String[] args) {
        Ani a = new Ani(); // Object 'a' created in memory
        a.details();             // This triggers the chain: details() -> eat()
    }
}