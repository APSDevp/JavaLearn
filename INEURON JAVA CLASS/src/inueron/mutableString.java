package inueron;

public class mutableString {
	
	public static void main(String args[]) {
		
		String s = new String("Sachin"); // create 2 object in SCP and Heap area
		String s1 = s.concat("tendulkar");
		
		System.out.println(s1);
		
		final StringBuffer sb = new StringBuffer("Dhi"); //mutable
		System.out.println(sb);
		sb.append("nesh");
		System.out.println(sb);
		//StringBuffer sb = new StringBuffer("newvalue");
		StringBuffer sb1 = new StringBuffer("Dhi");
		System.out.println(sb.equals(sb1)); // false beacuase String buffer doesn't have equal class so it will use object class
		
		//StringBuilder
		
		System.out.println("***  String Builder ***");
		
		StringBuffer sbuild = new StringBuffer();
		System.out.println(sbuild.capacity());
		sbuild.append(12345845);
		System.out.println(sbuild.capacity());
		
		StringBuffer sbuildnew = new StringBuffer("hello");
		System.out.println(sbuildnew.length());
		System.out.println(sbuildnew.capacity());
		sbuildnew.append("hell there what is happening i can't understand this topic better"); //(current capacity +1) * 2 ?
		System.out.println(sbuildnew.capacity()); //70 how?
		System.out.println(sbuildnew.length());
		
		//string buffer methods
		System.out.println("*********Sb methods***");
		StringBuffer bufmeth = new StringBuffer("sachinrameshtendulkar");
		System.out.println(bufmeth.length());
		System.out.println(bufmeth.capacity());
		bufmeth.setLength(6);
		System.out.println(bufmeth.length());
		System.out.println(bufmeth);
		bufmeth.trimToSize();
		System.out.println(bufmeth.capacity());
		System.out.println(bufmeth.length());
		bufmeth.ensureCapacity(7);  // used to increase the capacity
		System.out.println(bufmeth.capacity());
		System.out.println(bufmeth.length());
	}

}
