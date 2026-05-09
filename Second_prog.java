package Assignment_day3;

interface abc {
    double getArea();
    default double getPerimeter(int... sides) {
        int sum = 0;
        for (int s : sides) {
            sum += s;
        }
        return sum;
    }
    static String shapeInfo() {
        return "Polygon is a shape with multiple sides";
    }
}
class xyz implements abc {
    int l, b;
    xyz(int l, int b) {
        this.l = l;
        this.b = b;
    }
    public double getArea() {
        return l * b;
    }
}
class imp implements abc {
    int a, b, c;
    imp(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getArea() {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
public class Second_prog {
    public static void main(String[] args) {
        xyz r = new xyz(10, 5);
        System.out.println("Rect. Area: " + r.getArea());
        System.out.println("Rect. Perimeter: " + r.getPerimeter(10, 5, 10, 5));
        System.out.println("*******************");
        imp t = new imp(3, 4, 5);
        System.out.println("Tri. Area: " + t.getArea());
        System.out.println("Tri. Perimeter: " + t.getPerimeter(3, 4, 5));
        System.out.println("*********************");
        System.out.println(abc.shapeInfo());
    }
}