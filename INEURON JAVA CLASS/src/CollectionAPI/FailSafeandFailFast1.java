package CollectionAPI;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeandFailFast1 {

	public static void main(String[] args) {
		
		
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
			//al.add(99); //modification doing while accessing the data is called the Structural modification, it will leads to infinite loop
		    //it is called not fail fast
			//we have to fail the process if someone trying to add/modify the list
			//using the iterator 
		}
		
		System.out.println("------Fail Fast--------------");
		
		Iterator itr = al.iterator();
		
		while(itr.hasNext()) {
			try {
				System.out.println(itr.next());
				al.add(99);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("fail fast occured");
				break;
			} //trying to modifiying the collection which needs to be stopped by using the iterator
			//here we achieve fail fast
			//here it leads to concurrent exception
		}
		
		System.out.println("------Fail Safe--------------");
		
		CopyOnWriteArrayList cpw = new CopyOnWriteArrayList();
		
		cpw.add(100);
		cpw.add(200);
		cpw.add(300);
		
		Iterator itr1 = cpw.iterator();
		
		while(itr1.hasNext()) {
		
				System.out.println(itr1.next());
				cpw.add(400);
				//fail safe will not leads to srror to stop the program, it has to use CopyOnWriteArrayList, can't usein array list			
            }
		}
		

}


