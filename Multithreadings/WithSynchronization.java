package Multithreadings;

public class WithSynchronization {
	
	int count = 0;

    synchronized void add() {      // Thread 1 enters → locks method
    	                           // Thread 2 waits
    	count++;                         //Thread 1 finishes → releases lock
    	                           //Thread 2 runs

    }                            //👉 No overlap → correct result
        
	public static void main(String[] args) throws Exception {
		WithSynchronization c=new WithSynchronization();
		
		Thread t1 = new Thread(() -> c.add());
        Thread t2 = new Thread(() -> c.add());

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.count);
		

	}

}
