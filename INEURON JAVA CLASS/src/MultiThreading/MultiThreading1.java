package MultiThreading;

class Banking extends Thread{
	public void run() {
		
		BankingOperation(); //while extending the thread class which class run method - is inherited to this class, and what ever the task of the class need to be exted from run() methos which overides the Thread class run() methods
	      //we can also the write the entire method inside here rather than calling the method from here
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

class Printing extends Thread{
	
	public void run() {
		
		printingOperation(); //while extending the thread class which class run method - is inherited to this class, and what ever the task of the class need to be exted from run() methos which overides the Thread class run() methods
	      //we can also the write the entire method inside here rather than calling the method from here
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

class Calculation extends Thread{
	
	public void run() {
		
		CalculationOperation(); //while extending the thread class which class run method - is inherited to this class, and what ever the task of the class need to be exted from run() methos which overides the Thread class run() methods
	      //we can also the write the entire method inside here rather than calling the method from here
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

public class MultiThreading1 {

	public static void main(String[] args) throws Exception {
		
		//Single Threaded Programing
		//Below programs performs 3 different task and independent of each other
		//but it has only one therad and it needs to wait
		//so we can create seprate class
		
		/*
		System.out.println("Banking Task Started");
		
		for(int i =0;i<3;i++) {
			
			Thread.sleep(2000);
			
			System.out.println("Banking .....");
		}
		
		System.out.println("Banking Completed");
		
		
		System.out.println("----------------------------------------");
		
		
		System.out.println("Printing Task Started");
		
		for(int i =0;i<3;i++) {
			
			Thread.sleep(2000);
			
			System.out.println("Printing .....");
		}
		
		System.out.println("Printing Completed");
		
		
		System.out.println("----------------------------------------");
		
		
		System.out.println("Calculation Task Started");
		
		for(int i =0;i<3;i++) {
			
			Thread.sleep(2000);
			
			System.out.println("Calcualting .....");
		}
		
		System.out.println("Calculation Completed"); */
		
		Banking bank = new Banking();
		Printing print = new Printing();
		Calculation calc = new Calculation();
		
		//here we can use multi-threading so the CPU cycle won't be wasted
		//single thread issue an be overcome by using the multi threading
		
		
		/*
		bank.BankingOperation();
		print.printingOperation();
		calc.CalculationOperation();	 */
		
		bank.start(); //calling the class without invoking the run, start method automatically call the run() method
		print.start();
		calc.start();

	}

}
