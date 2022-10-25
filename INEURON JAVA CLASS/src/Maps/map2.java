package Maps;

import java.util.*;

public class map2 {
	
	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		
		hm.put(null, 0);
		hm.put(null, null); //here it will update the existing key
		hm.put(null, "ABC"); //Again the updation
		
		System.out.println(hm);
	}

}
