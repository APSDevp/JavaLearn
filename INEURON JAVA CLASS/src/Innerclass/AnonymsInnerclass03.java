package Innerclass;

public class AnonymsInnerclass03 {

	public static void main(String[] args) {
		
		
		Runnable r  = new Runnable() { //Runnable is interface we can't create object for it, here we extending the runnable interface with implementation 
			@Override
			public void run() {
				
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		
		System.out.println(r.getClass().getName());

	}

}
