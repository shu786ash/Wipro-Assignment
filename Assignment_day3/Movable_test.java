package Assignment_day3;

interface Movable{
    void up();
    void down();
    void left();
    void right();
}

class Point implements Movable{
    int x,y,s;
    Point(int x,int y,int s){
        this.x=x;
        this.y=y;
        this.s=s;
    }
    public void up(){ y=y+s; }
    public void down(){ y=y-s; }
    public void left(){ x=x-s; }
    public void right(){ x=x+s; }
    public String toString(){
        return x+" "+y;
    }
}
class Circle implements Movable{
    Point p;
    int r;
    Circle(int x,int y,int s,int r){
        p=new Point(x,y,s);
        this.r=r;
    }
    public void up(){ p.up(); }
    public void down(){ p.down(); }
    public void left(){ p.left(); }
    public void right(){ p.right(); }

    public String toString(){
        return "C "+p+" r="+r;
    }
}
class Rect implements Movable{

    Point p1,p2;

    Rect(Point a,Point b){
        p1=a;
        p2=b;
    }
    public void up(){ p1.up(); p2.up(); }
    public void down(){ p1.down(); p2.down(); }
    public void left(){ p1.left(); p2.left(); }
    public void right(){ p1.right(); p2.right(); }

    public String toString(){
        return p1+" "+p2;
    }
}
public class Movable_test{

    public static void main(String[] args){
        Point p=new Point(1,2,1);
        System.out.println(p);
        p.up(); p.right();
        System.out.println(p);
        System.out.println("----");
        Circle c=new Circle(5,5,1,10);
        System.out.println(c);
        c.left(); c.down();
        System.out.println(c);
        System.out.println("----");
        Point a=new Point(0,10,1);
        Point b=new Point(5,0,1);
        Rect r=new Rect(a,b);
        System.out.println(r);
        r.right(); r.up();
        System.out.println(r);
    }
}