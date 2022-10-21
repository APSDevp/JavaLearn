package MultiThreading;

class Alpha extends Thread{
	
	public void run(){
		
		String t = Thread.currentThread().getName();
		
		if(t.equals("Bank")) {
			BankingOperation();
		}else if(t.equals("Print")) {
			printingOperation();
		}else {
			CalculationOperation();
		}
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

public class MultiThreadingSinglrRunMethod {

	public static void main(String[] args) {
		
		//common resourse (Alpha) used by  threads
		Alpha a1 = new Alpha(); // creating thread object by creating the object for the class
		Alpha a2 = new Alpha();
		Alpha a3 = new Alpha();
		
		//naming the Thread
		a1.setName("Bank");
		a2.setName("Print");
		a3.setName("Clac");
		
		a1.start();
		a2.start();
		a3.start();

	}

}
