package MultiThreading;

class Producer1 extends Thread{
	
	//Producer producing the data in StringBuffer
	StringBuffer sb;
	


	public Producer1() {
		//StringBuffer is created with default capacity 16
		sb = new StringBuffer();
	}

	@Override
	public void run() {
	
		synchronized (sb) {
			for (int i = 1; i <= 10; i++) {
				try {
					sb.append(i + ": ");
					Thread.sleep(100);
					System.out.println("appending");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			sb.notify();
		}
		

	}
	

}

class Consumer1 extends Thread{
	
	//creating producer object to get the produced data
	Producer1 producer;
	
	
	public Consumer1(Producer1 producer) {
		this.producer = producer;
	}

	@Override
	public void run() {
	    

		synchronized (producer.sb) {
			try {
				producer.sb.wait();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(producer.sb);
		}
		
		
	}


	
}


//efficient(performance) way of interthread communication using wait( and notify()

public class MultiThreadingStatesBetterExp {

	public static void main(String[] args) {
		Producer1 obj1 = new Producer1();
		Consumer1 obj2 = new Consumer1(obj1);
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t2.start(); // consumer should wait
		t1.start(); // producer should start


	}

}
