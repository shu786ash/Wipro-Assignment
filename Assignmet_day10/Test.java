package Assignmet_day10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Order implements Runnable {
    private int orderId;

    public Order(int orderId) {
        this.orderId = orderId;
    }

    public void run() {
        System.out.println("Order " + orderId + " is being processed by " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (Exception e) {}
        System.out.println("Order " + orderId + " delivered by " + Thread.currentThread().getName());
    }
}

public class Test {
    public static void main(String[] args) {

        ExecutorService pool = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 10; i++) {
            pool.execute(new Order(i));
        }

        pool.shutdown();
    }
}