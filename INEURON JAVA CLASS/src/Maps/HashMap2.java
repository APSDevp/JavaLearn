package Maps;

import java.util.*;

public class HashMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap h = new HashMap();
		
		//creating the key
		
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		
		//if it is HashMap jvm calls equals(obj2) to identify whether keys are duplicated or not
		//i2.equals(i1) = true so it won't allow new entry just update the existing value
		
		//adding the data to HashMap
		
		h.put(i1, "Sachin");
		h.put(i2, "Messi");
		
		System.out.println(h);
		
		System.out.println("----------To have same key for tow different values---------");
		System.out.println("--------use the identiy hash map----------------------------");
		
		IdentityHashMap im = new IdentityHashMap();
		
		//creating the key
		
		Integer i3 = new Integer(10);
		Integer i4 = new Integer(10);
		
		//if it is identityHashMap JVM calls " == operator" to identify whether the keys are duplicated or not
		//i1==i2(false)
		//adding the values
		im.put(i3, "Sachin");
		im.put(i4, "Messi");
		
		System.out.println(im);
		
		
		
		
		

	}

}
