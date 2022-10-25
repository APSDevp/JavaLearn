package CollectionAPI;

import java.util.*;

public class AccessingDataCollection {

	public static void main(String[] args) {
		
		List l = new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		
		System.out.println(l); //to get all elements
		
		//by using the traditional forloop to access the data
		for(int i=0;i<=l.size()-1;i++) {
			System.out.println(l.get(i));
		}
		
		System.out.println("---------Enchanced For Loop-----------------");
		
		//enchanced for loop if index is not used to access the data
		
		for(Object o:l) {
			System.out.println(o);
		}
		
		System.out.println("-------Best Method to access the Collection using Iterator------");
		
		LinkedList ll = new LinkedList();
		
		ll.add(100);
		ll.add(200);
		ll.add("The FET Quest");
		ll.add("APS");
		
		Iterator itr1 = ll.iterator();
		
	
		
		while(itr1.hasNext()) {
			System.out.println( itr1.next());
			
			//LinkedList o = (LinkedList) itr1.next(); //tyoe casting ibject to lnkedlist
			//here parent type is stored in child so typecasting
	}
		
      System.out.println("-------Iterate in reverse direction-----------");		
      
         LinkedList l2 = new LinkedList();
	
				l2.add(100);
				l2.add(200);
				l2.add("The FET Quest");
				l2.add("APS");
				
			ListIterator litr3 =	l2.listIterator(l2.size()); //by using the listiterator we can access the data in reverse direction
			//by using the size() the iterator will go the last and wait there so we can start form the last
			//only for list the listiterator is available
			
			while(litr3.hasPrevious()) {
				System.out.println(litr3.previous());
			}
				
			System.out.println("-------------Descending----------------");
			Iterator ditr = l2.descendingIterator();
			
			while(ditr.hasNext()) {
				System.out.println(ditr.next());
			}

				
				
	}

}
