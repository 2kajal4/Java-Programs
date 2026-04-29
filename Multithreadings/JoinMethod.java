package Multithreadings;

public class JoinMethod extends Thread {
	
	public void run() {
		for(int i=0;i<=3;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) throws InterruptedException {
		JoinMethod t1=new JoinMethod();
		JoinMethod t2=new JoinMethod();
		
		t1.start();
		
		t1.join();  ////waits for t1 thread to complete and then start t2
		
		t2.start();
		
		
	}

}
