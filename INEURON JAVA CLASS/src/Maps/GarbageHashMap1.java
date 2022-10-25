package Maps;

import java.util.*;

class Temp {
	
	public String toString() {
		return "temp";
				
	}
	
	@Override
	public void finalize() {
		 System.out.println("Cleaning the object");
	}
	
}

public class GarbageHashMap1 {

	public static void main(String[] args) throws Exception {
	
		HashMap hm = new HashMap();
		Temp t = new Temp();
		hm.put(t, "ABC"); //t is converted to toString which is overidden in the actual class
		System.out.println(hm); //{temp=ABC}
		
		t = null; //Making eligible for Garbage Collection
		System.gc(); //Triggering garbage collector thread to clean 't'
		//while using the HashMap the when Garbage goes to clean, then HashMap won't allow to do it like normal method
	    //HashMap will be dominate
		
		
		Thread.sleep(5000); //cleaning will take some time
		
		System.out.println(hm);
     
		
		System.out.println("--To Clean using Garbage ---------");
		
		WeakHashMap wm = new WeakHashMap();
		Temp w = new Temp();
		wm.put(w, "ABC"); //t is converted to toString which is overidden in the actual class
		System.out.println(hm); //{temp=ABC}
		
		w = null; //Making eligible for Garbage Collection
		System.gc(); //Triggering garbage collector thread to clean 't'
		//while using the weakHashMap the when Garbage goes to clean, then weakHashMap  allow to do it like normal method
	    //weakHashMap will not dominate as it is weak
		
		
		Thread.sleep(5000); //cleaning will take some time
		System.out.println("AFter cleaning");
		System.out.println(wm);

	}

}
