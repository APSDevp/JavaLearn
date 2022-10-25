package Maps;

class Employee{
	@Override
	public void finalize() {
		 System.out.println("Cleaning the object");
	}
}

public class GarbageCollectOver {

	public static void main(String[] args) throws Exception {
		
		Employee e = new Employee();
		
		;;;;;;;;;
		;;;;;;;;;
		
		e = null;
		
		System.gc(); //Informing JVM to activate GC thread to clean Garbage object
		
		Thread.sleep(5000);
	}

}
