package Singletonwaysofcreatingobj;

public class singleton1 {

	public static void main(String[] args)  throws CloneNotSupportedException {
		
		//static factory method and it is a singleton class(Runtime)
		
		Runtime r1 = Runtime.getRuntime();
		
		Runtime r2 = Runtime.getRuntime();
	  
		//System.out.println(r1.hashCode());
		//System.out.println(r2.hashCode());
		
		System.out.println(r1==r2); //create only one object
		
		
		

	}

}
