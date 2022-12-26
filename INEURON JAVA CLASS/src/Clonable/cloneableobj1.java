package Clonable;

public class cloneableobj1 implements Cloneable { //implemets market interface
	
	int i = 20;
	int j = 20;

	public static void main(String[] args) throws CloneNotSupportedException {
	  
		cloneableobj1  c1 = new cloneableobj1 ();
		cloneableobj1  c2 = (cloneableobj1)c1.clone(); //to create the clone of the object ref c1.
		
		c2.i = 222; //over-writting afer cloned
		c2.j = 333;
		
		System.out.println(c1.i + "===>"+c2.i);
		System.out.println(c1.j + "===>"+c2.j);

	}

}
