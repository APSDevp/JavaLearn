package MultiThreading;

class Banking1 implements Runnable{
	public void run() {
		
		BankingOperation(); 
 	}
	
	void BankingOperation(){
          System.out.println("Banking Task Started");
          
		   for(int i =0;i<3;i++) {
	    try {
			Thread.sleep(2000);
			
		   }
		  catch(InterruptedException e) {
			   e.printStackTrace();
		   }
	    System.out.println("Banking .....");
		}
		
		System.out.println("Banking Completed");
		
	}

}

class Printing2 implements Runnable{
	
	public void run() {
		
		printingOperation(); 
 	}
	
	void printingOperation(){
		System.out.println("Printing Task Started");
        
		   for(int i =0;i<3;i++) {
	    try {
			Thread.sleep(2000);
			
		   }
		  catch(InterruptedException e) {
			   e.printStackTrace();
		   }
	    System.out.println("printing.....");
		}
		
		System.out.println("printing Completed");
	}
}

class Calculation3 implements Runnable{
	
	public void run() {
		
		CalculationOperation(); 
 	}
	void CalculationOperation(){
		
		System.out.println("Calucation Task Started");
        
		   for(int i =0;i<3;i++) {
	    try {
			Thread.sleep(2000);
			
		   }
		  catch(InterruptedException e) {
			   e.printStackTrace();
		   }
	    System.out.println("Calucating .....");
		}
		
		System.out.println("Calucation Completed");
		
	}
}


public class MultiThreadingRunnableiNTERFACE2 {
	
	public static void main(String[] args) throws Exception {
		//to check main thread
		System.out.println("Main thread got the chance");
		Thread t = Thread.currentThread();
		System.out.println("thread 1"+t.isAlive());
		
		Banking1 b1 = new Banking1();
		Printing2 p1 = new Printing2();
		Calculation3 c1 = new Calculation3();
		
		//have to create thread seprately because here we implementing the runnable so by default there will be no thread
		
		Thread t1 = new Thread(b1); //constructor, it will automatically invokes run method 
		Thread t2 = new Thread(p1);
		Thread t3 = new Thread(c1);
		
		System.out.println(t1.isAlive());
		
		t1.start();
		t2.start();
		t3.start();
		//main thread will stop here
		System.out.println("thread 1"+t1.isAlive());
		System.out.println("thread 2"+t2.isAlive());
		System.out.println("thread 3"+t3.isAlive());
		
		//to make thread to wait so other thread will join
		
		t1.join(); // here we saying to main thread to stop till t1 complete it's task and join the main thread 
		t2.join();
		t3.join();
		
		
		
		System.out.println("Main thread got the chance to end first");
		
	}

}
