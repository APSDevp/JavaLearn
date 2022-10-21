package MultiThreading;

class BathRoom implements Runnable{
	//synchronized to lock the thread so only one thread will run at a time 
	//even the CPU cycle is wasted but it will give consistency - other thread will not disturb the flow
	
	synchronized public void run() {
		
		try {
			System.out.println(Thread.currentThread().getName()+ " has entered the bathroom ");
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName()+ " is using the bathrooom ");
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName()+ " exited the bathrooms ");
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class MultiThreadingEfficent {

	public static void main(String[] args) {
		
       //one resourse(BathRoom) shared by 3 threads
		
		BathRoom b1 = new BathRoom();
		
		Thread t1 = new Thread(b1);
		Thread t2 = new Thread(b1);
		Thread t3 = new Thread(b1);
		
		t1.setName("Boy");
		t2.setName("girl");
		t3.setName("crazy");
		
		t1.start();
		t2.start();
		t3.start();
		
		

	}

}
