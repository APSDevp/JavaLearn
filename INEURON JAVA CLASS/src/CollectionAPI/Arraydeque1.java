package CollectionAPI;

import java.util.*;

public class Arraydeque1 {

	public static void main(String[] args) {
		
		ArrayDeque ad = new ArrayDeque();
		
		ad.add(32);
		ad.add(45);
		ad.add("Dhinesh");
		ad.add(32); //duplicates are allowed
		
		System.out.println(ad);
		
		ad.addFirst("First Ob");
		ad.addLast("Last ob");
		
		System.out.println(ad);
		
		ad.pop(); //removes the first elements
		
		System.out.println(ad);
		
		//System.out.println(ad.parallelStream());
		
		

	}

}
