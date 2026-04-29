package Multithreadings;

public class SleepMethod extends Thread {
	
	public void run() {
		try {
			for(int i=0;i<=5;i++) {
				System.out.println(i +" - " +Thread.currentThread().getName());
				Thread.sleep(500);   //pauses the thread for a specific period of time
			}
		}catch(InterruptedException e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		SleepMethod t1=new SleepMethod();
		SleepMethod t2=new SleepMethod();
		
		t1.start();
		t2.start();

	}

}
