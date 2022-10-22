package MultiThreading;

class Demo extends Thread{
	int total = 0;
	
	public void run() {
		synchronized(this){
		System.out.println("Child thread starts the calculation");	
		for(int i=0;i<=10;i++) {
			total = total + i;
			//System.out.println(total);
		}
		System.out.println("child theread is giving the notification the call");
		this.notify();
		}
	}
}

//Demo lass has total variable

//Main Thread -> needs Demo class total variable with proper value

//User defined thread -> should update the total variable in Demo class

// Main Method -> Needs Demo class total variable with proper value , * Lock is applied on Demo object and call wait
 //         wait( release the lock of demo object and main thread enters into sleeping state

//User Defined Thread, -> Should update total variable in demo class and it should send the notification
 //    notify() is used so the code should be in sync regiobn
 //    it needs the lock of Demo object, now the calculation is started to  update
 //    it will give notification 

public class MultiThreadingstates {
	
	public static void main(String[] args) throws Exception {
		
		Demo d1 = new Demo();
		d1.start();
		System.out.println(d1.getName());
		
		
		
		//Thread.sleep(100); // won't be efficient coz here TS giving chance to msin thread always so when we give thread sleep, it will allow d1 thread to run the for loop but we don't know the exact time required to complete the loop
		//d1.join(); // join also not a good way coz if there is more statement below the those ned to wait which is not efficient for cpu n
		
		//consumer thread
		synchronized(d1) {
			System.out.println("Main Thread is calling wait() mehthod to get updated result ...");
			 d1.wait(); //main thread is waiting so d1 thread will be started //here main thread will go to sleep state and other thread will start, wait thread is used to get the updated result from the calling thread //wait will cause lock to release and goes to sleep state
			System.out.println("Main Thread got the notification call");
		System.out.println(d1.total);}
		
	}

}
