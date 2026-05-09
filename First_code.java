//1.Write a program where a method accepts an
//integer parameter and tries to change its value.
//Print the value before and after the method call.

package Assignment_day6;
public class First_code {

    static void change(int x){
        x = 100;
    }

    public static void main(String[] args){
        int a = 10;
        System.out.println("Before call Value is: " + a);
        change(a);
        System.out.println("After call the value is: " + a);
    }
}