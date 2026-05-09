package Assignmet_day10;
//class NumberPrinter {
//    int num = 1;
//    int limit = 100;
//
//    public synchronized void printOdd() {
//        while (num <= limit) {
//            if (num % 2 == 0) {
//                try {
//                    wait();
//                } catch (Exception e) {}
//            } else {
//                System.out.print(num + " ");
//                num++;
//                notify();
//            }
//        }
//    }
//    public synchronized void printEven() {
//        while (num <= limit) {
//            if (num % 2 != 0) {
//                try {
//                    wait();
//                } catch (Exception e) {}
//            } else {
//                System.out.print(num + " ");
//                num++;
//                notify();
//            }
//        }
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//
//        NumberPrinter obj = new NumberPrinter();
//
//        Thread t1 = new Thread(() -> obj.printOdd());
//        Thread t2 = new Thread(() -> obj.printEven());
//
//        t1.start();
//        t2.start();
//    }
//}
class PrintABC {
    int state = 0;
    int times = 5;

    public synchronized void printA() {
        for (int i = 0; i < times; i++) {
            while (state != 0) {
                try { wait(); } catch (Exception e) {}
            }
            System.out.print("A ");
            state = 1;
            notifyAll();
        }
    }
    public synchronized void printB() {
        for (int i = 0; i < times; i++) {
            while (state != 1) {
                try { wait(); } catch (Exception e) {}
            }
            System.out.print("B ");
            state = 2;
            notifyAll();
        }
    }
    public synchronized void printC() {
        for (int i = 0; i < times; i++) {
            while (state != 2) {
                try { wait(); } catch (Exception e) {}
            }
            System.out.print("C ");
            state = 0;
            notifyAll();
        }
    }
}
public class Main {
    public static void main(String[] args) {

        PrintABC obj = new PrintABC();

        Thread t1 = new Thread(() -> obj.printA());
        Thread t2 = new Thread(() -> obj.printB());
        Thread t3 = new Thread(() -> obj.printC());

        t1.start();
        t2.start();
        t3.start();
    }
}