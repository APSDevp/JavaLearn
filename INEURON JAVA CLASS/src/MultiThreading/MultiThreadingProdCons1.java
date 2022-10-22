package MultiThreading;

//in this code when interaction happens b/w 2 threads, always the consumer thread is ready for 
//consumption, but the consumer thread will get the data only when the dataprovider value is set to true
//this increase the waiting time of athread and makes the cpu time idle, through which communication b/w 2 threads 
//wont be efficient

//to overcome the effecieny problems we can use the method given by Object class
//wait()
//notify()
//notifyAll()

class Producer extends Thread{
	
	//Producer producing the data in StringBuffer
	StringBuffer sb;
	
	//variable used by the thread for the communication
	boolean dataProvider =false;

	public Producer() {
		//StringBuffer is created with default capacity 16
		sb = new StringBuffer();
	}

	@Override
	public void run() {
	
		for(int i=1;i<=10;i++) {
			try {
				sb.append(i + ": ");
				Thread.sleep(100);
				System.out.println("appending");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		//informing the consumer that data is produced
		dataProvider = true;
	}
	

}

class Consumer extends Thread{
	
	//creating producer object to get the produced data
	Producer producer;
	
	
	public Consumer(Producer producer) {
		this.producer = producer;
	}

	@Override
	public void run() {
	    
		//check for the producer data provider for the dataprovider variable
		//if true only consume the data otherwise enter into sleeping state
		while (producer.dataProvider == false) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(producer.sb);
		
		
	}


	
}

//inefficent way of interthread communication
public class MultiThreadingProdCons1 {
	
	public static void main(String[] args) {
		 
		Producer obj1 = new Producer();
		Consumer obj2 = new Consumer(obj1);
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t2.start(); // consumer should wait
		t1.start(); // producer should start
	}

}
