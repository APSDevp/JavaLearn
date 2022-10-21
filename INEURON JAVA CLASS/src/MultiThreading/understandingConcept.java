package MultiThreading;

public class understandingConcept {

	public static void main(String[] args) throws Exception{
		System.out.println(" Hello there");
		
		//thread will be created and start the execution, here from main it will start
		//whatever the sub-process inside will be also executed
		
		Thread.sleep(5);
		
		//Thread is a class
		
		Thread t =Thread.currentThread(); //gives (name of the thread, priority, method where it is running)
		System.out.println(t);
		//[main,5,main]
		
		System.out.println(t.getName()); //to get the only the name of the thread
		
		System.out.println("Thread us executing this after the sleep time");
		
		//when thread is created by java or developer it will have two parameter -> name and priority
		
		//to change the name of the thread and priority
		
		t.setName("Dhine");
		t.setPriority(4);
		System.out.println(t);

	}

}
