

package Assignment_day3;

//interface
interface Polygon {

 double getArea();

 default double getPerimeter(int... sides) {
     int sum = 0;
     for(int i=0;i<sides.length;i++){
         sum = sum + sides[i];
     }
     return sum;
 }

 static String shapeInfo() {
     return "This is a polygon shape";
 }
}

//Rectangle class
class Rectangle implements Polygon {

 int l,b;

 Rectangle(int l,int b){
     this.l=l;
     this.b=b;
 }

 public double getArea(){
     return l*b;
 }
}

//Triangle class
class Triangle implements Polygon {

 int base,height;

 Triangle(int base,int height){
     this.base=base;
     this.height=height;
 }

 public double getArea(){
     return 0.5*base*height;
 }
}

//main class
public class PolygonTest {

 public static void main(String[] args) {

     Rectangle r = new Rectangle(5,4);
     System.out.println("Rectangle Area = "+r.getArea());
     System.out.println("Rectangle Perimeter = "+r.getPerimeter(5,4,5,4));

     System.out.println("-----");

     Triangle t = new Triangle(6,3);
     System.out.println("Triangle Area = "+t.getArea());
     System.out.println("Triangle Perimeter = "+t.getPerimeter(3,4,5));

     System.out.println("-----");

     System.out.println(Polygon.shapeInfo());
 }
}
public class Polygon {

}
