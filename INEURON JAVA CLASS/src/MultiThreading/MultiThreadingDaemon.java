package MultiThreading;


class Rubber implements Runnable {
	public void run() {
		try {
			
			for(int i=0;i<5;i++) {
				
				System.out.println("Java is best to understand the coding");
				Thread.sleep(3000);
			}
			
		}catch(Exception e) {
			System.out.println(" some issues");
			e.printStackTrace();
		}
	}
}


public class MultiThreadingDaemon {
	
	public static void main(String[] args) {
		
		//Daemon thread is low priority thread
		
		Thread t = Thread.currentThread();
		
		System.out.println(t.isDaemon());
		
		//t.setDaemon(true);  //we can't make change deafult thread
		Rubber R = new Rubber();
		
		Thread t1 = new Thread(R); //by default all theread is non-deamon - child thread
		
		System.out.println(t1.isDaemon());
		
		t1.start();
		
		//t1.setDaemon(true);
		
		//System.out.println(t1.isDaemon());
		
		
	}

}
