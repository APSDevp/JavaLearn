package GenercCollection;

import java.util.*;

//user-defined
class Gen<T>{
	
	T obj;
	
	Gen(T obj){ //constructor to pass the value to above obj
		this.obj = obj;
	}
	
	public void show() {
		System.out.println("The Type of the object is :: "+obj.getClass().getName());
	}
	
	public T getObj() {
		return obj;
	}
}

public class UserDefinedGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gen<Integer> g1 = new Gen<Integer>(10);
		g1.show();
		System.out.println(g1.getObj());
		
		
		Gen<String> g2 = new Gen<String>("Dhi");
		g2.show();
		System.out.println(g2.getObj());
		

	}

}
