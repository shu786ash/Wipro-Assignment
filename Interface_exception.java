package Assignment_day4;

interface Calculator {

    void divide(int a,int b);
}

class CalcImpl implements Calculator {

    public void divide(int a,int b){

        try{
            int res = a/b;
            System.out.println(res);
        }
        catch(Exception e){
            System.out.println("Error->divide by zero");
        }
    }
}
public class Interface_exception {

    public static void main(String[] args){
        CalcImpl c = new CalcImpl();
        c.divide(10,2);
        c.divide(10,0);
    }
}