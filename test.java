package Advance_code;
interface calc {
    double solve(double a, double b);
}

public class test {
    public static void main(String[] args) {
        calc add = (a, b) -> a + b;
        calc sub = (a, b) -> a - b;
        calc mult = (a, b) -> a * b;
        calc divide = (a, b) -> a / b;
        System.out.println( add.solve(10, 5));
        System.out.println(sub.solve(10, 5));
        System.out.println(mult.solve(10,5));
        System.out.println(divide.solve(10,5 )); 
    }
}