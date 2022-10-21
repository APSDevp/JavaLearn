package MultiThreading;

class Warrior implements Runnable{
	
	String s1 = new String("Brhmastra");
	
	String s2 = new String("Pashupastra");
	
	String s3 = new String("Sarpastra");
	
	public void run() {
		try {
			String op = Thread.currentThread().getName();
			
			if(op.equals("Rama")) {
				
				ramaAcqRes();
				
			}else {
				ravanaAcqRes();
			}
		}catch(Exception e) {
			System.out.println("Some interruption");
		}
	}
	
	public void ramaAcqRes() {
		
		try {
			
			Thread.sleep(4000);
			
			synchronized(s1) {
				System.out.println("Rama has acquired "+ s1);
				
				Thread.sleep(4000);
				
				synchronized(s2) {
					System.out.println("Rama has acquired "+ s2);
					
					Thread.sleep(4000);
					
					synchronized(s3) {
						System.out.println("Rama has acquired "+ s3);
					}
					
				}
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void ravanaAcqRes() {
        try {
            Thread.sleep(4000);
			
			synchronized(s3) {
				System.out.println("Ravana has acquired "+ s1);
				
				Thread.sleep(4000);
				
				synchronized(s2) {
					System.out.println("Ravana has acquired "+ s2);
					
					Thread.sleep(4000);
					
					synchronized(s1) {
						System.out.println("Ravana has acquired "+ s3);
					}
					
				}
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

public class MultiThreadingStatesConcepts {

	public static void main(String[] args) {
		
		Warrior w = new Warrior();
		
		Thread t1 = new Thread(w);
		
		Thread t2 = new Thread(w);

		
		t1.setName("Rama");
		t2.setName("Ravana");
		
		t1.start();
		t2.start();


	}

}
