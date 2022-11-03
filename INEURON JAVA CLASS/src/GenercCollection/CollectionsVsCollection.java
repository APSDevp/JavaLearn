package GenercCollection;

import java.util.*;

public class CollectionsVsCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList();
		al.add(50);
		al.add(20);
		al.add(40);
		al.add(30);
		al.add(10);
		
		System.out.println(al);
        Collections.sort(al);
        System.out.println(al); //Coolections utility class used for sort
	}

}
