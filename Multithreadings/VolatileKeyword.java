package Multithreadings;

public class VolatileKeyword {
	
	volatile boolean running=true;
	
	void runTask() {
		while(running) {
			
		}
		System.out.println("stopped");
	}

	public static void main(String[] args) throws Exception {
		
		VolatileKeyword vk=new VolatileKeyword();
		
		Thread t1=new Thread(() -> vk.runTask());
		
		t1.start();
		
		Thread.sleep(1000);  //waits the thread
		
		vk.running=false;  //stops the thread
		
		
	}

}
