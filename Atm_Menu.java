package Assignment_day2;
import java.util.Scanner;
public class Atm_Menu {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int bal = 10000;
        boolean run = true;
        while(run){
            System.out.println("1.Check Balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Balance:" + bal);
                    break;
                case 2:
                    System.out.print("Enter amount:");
                    int d = sc.nextInt();
                    if(d > 0){
                        bal = bal + d;
                        System.out.println("Deposited " + d);
                    } else {
                        System.out.println("wrong amount");
                    }
                    break;
                case 3:
                    System.out.print("Enter amount:");
                    int w = sc.nextInt();
                    if(w <= bal){
                        bal = bal - w;
                        System.out.println("Withdraw " + w);
                    } else {
                        System.out.println("no balance");
                    }
                    break;
                case 4:
                    System.out.println("Exit");
                    run = false;
                    break;
                default:
                    System.out.println("wrong choice");
            }
        }
    }
}