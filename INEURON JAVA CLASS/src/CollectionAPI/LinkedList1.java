package CollectionAPI;

import java.util.*;

public class LinkedList1 {

	public static void main(String[] args) {
		
		LinkedList l1 = new LinkedList();
		
		l1.add(10);
		l1.add("Dhinesh");
		l1.add("APS");
		l1.add("Chennai");
		
		System.out.println(l1);
		
		l1.add(2,70);
		
		System.out.println(l1);
		
		l1.addFirst("The Fet");
		l1.addLast("Bang it");
		
		System.out.println(l1);
		
		LinkedList l2 = new LinkedList();
		
		l2.add("India"); //will add date forcefully
		l2.offer("Chennai"); //offer method, offering to collection, collection may accept or reject.
		//if no memory then it will reject
		//offerFirst,offerLast are also there
		
		System.out.println(l2);



	}

}
