package Assignment_day4;

abstract class Bank {

    abstract void intRate();
}

class sbi extends Bank {

    void intRate(){
        System.out.println(" sbi rate = 7%");
    }
}

class hdfc extends Bank {

    void intRate(){
        System.out.println("hdfc Rate= 8%");
    }
}

public class Bank_with_method {

    public static void main(String[] args){

        sbi s = new sbi();
        s.intRate();

        hdfc h = new hdfc();
        h.intRate();
    }
}