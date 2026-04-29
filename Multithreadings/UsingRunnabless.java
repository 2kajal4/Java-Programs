package Multithreadings;

public class UsingRunnabless implements Runnable {
	 public void run() {
		 System.out.println("Thread name" +Thread.currentThread().getName());
	 }
	

	public static void main(String[] args) {
		
		UsingRunnabless u=new UsingRunnabless();
		Thread t1=new Thread(u);
		Thread t2=new Thread(u);
		
		
//		Thread t1 =new Thread(new UsingRunnabless());
//		Thread t2=new Thread(new UsingRunnabless());
		
		
		
		t1.start();
		t2.start();
		
		

	}

}
