package Multi_threading;

public class TestThread implements Runnable {
	public void run() {
		for(int i =0;i<3;i++) {
			System.out.println(Thread.currentThread().getName());
			//thread yield
		}
	}
    public static void main(String args[]) {
    	TestThread t0 =  new TestThread();
    	t0.run();
    	TestThread t1 =  new TestThread();
    	t1.run();
    	System.out.println(t0.equals(t1));
    }
}
