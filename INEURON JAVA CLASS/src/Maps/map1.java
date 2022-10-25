package Maps;

import java.util.*;

//Map is interface so we can't initiate the object
public class map1 {

	public static void main(String[] args) {
	
      HashMap hm = new HashMap();
      
      hm.put(10,"Sachin");
      hm.put(07,"Dhoni");
      hm.put(18,"Virat");
      hm.put(19,"Dravid");
      hm.put(45,"Rohit");
      
      //will be strored in hashTable so insertion order will not be maintained
      
      System.out.println(hm); //hm.toSring() will be called
      
      //to get only the key
      Set s  = hm.keySet(); //method gets executed and the object is created at the runtime
      
      System.out.println(s);
      System.out.println(s.getClass().getName());
      
      Collection c = hm.values();
      System.out.println(c);
      
      Set es = hm.entrySet();
      System.out.println(es);
      System.out.println(es.getClass().getName());
      
      //iterating
     System.out.println("------Iterator----------------");
     
     Iterator Data = es.iterator();
     
     while(Data.hasNext()) {
    	Map.Entry ob =(Map.Entry) Data.next();
    	System.out.println(ob.getKey() + ": "+ ob.getValue());
    	
    	if(ob.getKey().equals(10)) {
    		ob.setValue("SRT");
    		
    		System.out.println(ob.getKey() + ": "+ ob.getValue());
    	}
     }
     
      
		
	}

}
