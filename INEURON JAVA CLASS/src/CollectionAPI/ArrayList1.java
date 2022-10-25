package CollectionAPI;


import java.util.*;

//Collection API is part of util.
//only for lang package w don't need to import rest we have to import

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ArrayList al1 = new ArrayList();
		
		al1.add("TheFetQuest");
		al1.add("MediumBlog");
		al1.add("YoutubeChennal");
		al1.add("Podcast");	
		al1.add(16);
		al1.add(16.04);	
		//al1.add("TheFetQuest");
		
		System.out.println(al1); //hetrogenus
		System.out.println(al1.contains(16.04));
		
		ArrayList al2 = new ArrayList();
		
		al2.add(10);
		al2.add(20);
		al2.add(30);
		
		System.out.println(al2); //homogenus
		
		al2.addAll(al1); // Adding twoArrayList
		
		System.out.println(al2);
		
		System.out.println(al2.get(1)); //to get the array value based on index
		
		System.out.println(al2.isEmpty()); //to check whether empty or not
		
		System.out.println(al2.size());
		
		System.out.println(al2.getClass());
		
		ArrayList al3 = new ArrayList();
		
		al3.add("Chennai");
		al3.add("India");
		al3.add(15);
		al3.add("10.5");
		
		System.out.println(al3);
		
		al3.clear(); //remove all the elements in array list
		
		System.out.println(al3);
		
		System.out.println(al3.isEmpty());
		
		al3.ensureCapacity(5); //reserving the allocationa and minimum of 5 allocation will be provided here
		
		//accept 5 entries
		
		al3.add("Chennai");
		al3.add("India");
		al3.add(15);
		al3.add("10.5");
		
		
		al3.add(1,"Bharath"); //it will add the obj as new in the index
		
		//number of objects/elements inside the list
		System.out.println(al3.size());
		
		//we can cut the size so extra capacity will be trimmed
		al3.trimToSize();

		System.out.println(al3);
		
		ArrayList al4 = new ArrayList();
		
		al4.add(100);
		al4.add(200);
		
		al4.addAll(1, al3); //entire collection will be added in the index
		
		System.out.println(al4);
		System.out.println(al4.get(1));
		
		

	}

}
