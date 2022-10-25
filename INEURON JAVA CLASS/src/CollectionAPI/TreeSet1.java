package CollectionAPI;

import java.util.*;

public class TreeSet1 {

	public static void main(String[] args) {
		
		
		TreeSet ts = new TreeSet();
		
		//Ascending sorted order
		//duplicates are not allowed
		
		ts.add(100);
		ts.add(50);
		ts.add(150);
		ts.add(25);
		ts.add(26);
		ts.add(75);
		ts.add(125);
		ts.add(175);
		//ts.add(175);
		
		System.out.println(ts);
		
		System.out.println(ts.higher(25));
		System.out.println(ts.ceiling(25));
		
		
		TreeSet ts1 = new TreeSet();
		
		ts1.add(35);
		ts1.add(40);
		ts1.add(42);
		ts1.add(20);
		ts1.add(50);
		ts1.add(75);
		ts1.add(15);
		
		System.out.println(ts1.higher(20)); // to get the next value higher than 35
		
		System.out.println(ts1.ceiling(30)); // it gives only the nearest higher value, if there is no nearest higher value then it will return the same value which we given here
		//if the ceiling object(number) is already present then it will give the same number, won't next nearest number
		
		System.out.println(ts1.floor(19));
		System.out.println(ts1.lower(20));

	}

}
