package Multi_threading;

public class MyThread extends Thread{
	static class JoinThread extends Thread{
//	void action() {
//		
//	}
//	void audio() {
//		
//	}
//	void ex_slidder() {
//		
//	}
//	public static void main(String args[]) {
//		MyThread p = new MyThread();
//		p.action();
//		p.audio();
//		p.ex_slidder();
	//	MyThread t = new MyThread();
//		t.action();//2 ms
//		t.audio();// 2 ms
//		t.ex_slidder();//2 ms
	public void run() {
		for(int i =0;i<2;i++) {
		System.out.println(Thread.currentThread().getName());
	}
	}
}
	public static void main(String args[])throws InterruptedException {
//		MyThread t0 = new MyThread();//new state
//		t0.start();
//		t0.sleep(6000);// pause execution for that thread
//		MyThread t1 = new MyThread();//new state output is threAD 1 AND 0 DUE TO SIMULTANEOUSLY TASK
//		t1.start();
//		System.out.println("Priority for t1="+t1.getPriority());
//		t1.setPriority(7);
//		System.out.println("after assign Priority for t1="+t1.getPriority());
//		MyThread t2 = new MyThread();//new state
//		t2.start();
//		System.out.println("T2 name ="+t2.getName());
//		t2.setName("Max");
//		System.out.println("T2 name ="+t2.getName());
//		MyThread t0 = new MyThread();
//		MyThread t1 = new MyThread();
//		MyThread t2 = new MyThread();
//		t0.start();
//		t1.start();
//		t2.start();
//		t0.join();
		
		
		
		
	}

}
