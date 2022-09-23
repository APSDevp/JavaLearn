package interFaceConcepts;

interface Demo1{
	
	void disp();
	//by using the default we can use body inside the interface class
	//default method can be inherited
	default void call() {
		System.out.println("We can use body  by using the default before the method name");
	}
	
	static void bell() {
		System.out.println("This is Static class in interface");
	}
	
	//From Java 9 we can have private method inside the interface
	
	private void shock() {
		System.out.println("it is private method");
	}
	
	//we can call private method from 
	default void schok2() {
		shock();
	}

}

/*
interface Demo2 extends Demo1{
	
} */

class Deml implements Demo1{
	
	public void disp() {
		System.out.println("Hey this is disp method");
	}
}

public class InterfaceMultiConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Demo1 dl = new Deml();
		 dl.disp();
		 dl.call();
		 dl.schok2();
		 
		 //to call the static method
		 Demo1.bell();
		 
		 }

}
