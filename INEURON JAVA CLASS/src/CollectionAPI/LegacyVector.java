package CollectionAPI;

import java.util.Enumeration;

import java.util.Vector;

//not used nowaday, only collection class is used now a days


public class LegacyVector {

	public static void main(String[] args) {
		
		Vector v=new Vector();
		
		v.add(100);
		v.add(200);
		v.add(300);
		v.add(400);
		
		Enumeration e = v.elements();
		
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}
