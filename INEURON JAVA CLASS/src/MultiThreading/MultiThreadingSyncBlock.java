package MultiThreading;

class neuro implements Runnable{
	
 public void run(){
	try {
		
		for(int i =0; i<5;i++) {
			
			System.out.println(i);
		}
		
		Thread.sleep(3000);
		
		synchronized(this) { //only locking the block using the sync
		for(int i =0; i<5;i++) {
			
			System.out.println((char)(i+65));
		}
		}
		
	}catch(Exception e) {
		System.out.println("Some Interruption");
	}
}
}

public class MultiThreadingSyncBlock {

	public static void main(String[] args) {
		
		neuro n1 = new neuro();
		
		Thread t1 = new Thread(n1);
		Thread t2 = new Thread(n1);
		Thread t3 = new Thread(n1);
		
		t1.start();
		t2.start();
		t3.start();


	}

}
