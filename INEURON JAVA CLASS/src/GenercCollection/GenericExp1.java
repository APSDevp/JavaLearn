package GenercCollection;

import java.util.*;

public class GenericExp1 {

	public static void main(String[] args) {
		
		//Generic Syntax
		
		ArrayList<String> al = new ArrayList<String>(); //we are giving the <String> so it only the accept the String in the collection
		
		al.add("Dhinesh");
		//al.add(15); //we can't add the int here
		al.add("APS");
		
		//System.out.println(al);
		
		String FirstName = al.get(0);
		String SecondName = al.get(1);
		
		System.out.println("The user is"+" "+ FirstName+ " "+SecondName);
		
		//ArrayList<int> al = new ArrayList<int>();//invalid - only the reference(wrapper class) is alowed not the primitive type
		
		
		
		
		

	}

}
