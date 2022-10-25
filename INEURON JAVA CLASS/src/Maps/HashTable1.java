package Maps;

import java.util.*;

public class HashTable1 {

	public static void main(String[] args) {
	
		Hashtable ht = new Hashtable();
		
		ht.put(10, "sachin");
		ht.put(7, "Dhoni");
       
		//System.out.println(null,"abc"); //null can't be a key
		ht.put("abc",null);
	    System.out.println(ht);
	  

	}

}
