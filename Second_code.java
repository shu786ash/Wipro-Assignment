package Assignment_day6;

class Box {
    int length;
}
class Test2 {
    static void change(Box b){
        b.length = 50;
    }
}
public class Second_code {

    public static void main(String[] args){
        Box b = new Box();
        b.length = 10;
        System.out.println("before call " + b.length);
        Test2.change(b);
        System.out.println("after call " + b.length);
    }
}