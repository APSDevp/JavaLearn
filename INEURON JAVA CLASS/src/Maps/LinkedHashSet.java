package Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashSet {

	public static void main(String[] args) {
		
		 LinkedHashMap hm = new LinkedHashMap();
		 
	      hm.put(10,"Sachin");
	      hm.put(07,"Dhoni");
	      hm.put(18,"Virat");
	      hm.put(19,"Dravid");
	      hm.put(45,"Rohit");
	      
	      System.out.println(hm);
	      
	     //Here the insertion order will be maintained
	     //no other difference between HashMap and LonkedHashMap

	}

}
