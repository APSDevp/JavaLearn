package CollectionAPI;
import java.util.*;
public class HashSetandLinkedHashset {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		hs.add(100);
		hs.add(50);
		hs.add(150);
		hs.add(25);
		
		System.out.println(hs); //no sorted, no order of insertion
		
		if(hs.contains(25)) {
			System.out.println("it has the value");
		}
		
		
		if(!hs.contains(20)) {
			System.out.println("it doesn't has the value");
		}
		
		LinkedHashSet lks = new LinkedHashSet();
		
		lks.add(100);
		lks.add(50);
		lks.add(150);
		lks.add(25);
		//lks.add(25); //no duplicates allowed
		
		System.out.println(lks); //follows order of insertion
		


	}

}
