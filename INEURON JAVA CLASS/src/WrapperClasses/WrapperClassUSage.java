package WrapperClasses;

//utility method(helper method/static methods)
//1.valueOF() -> used to create wrapper for primitive or string
//valueOf is also part of character class
//2.xxxxValue() --to convert wrapper to primitive
//3.parseXXX()
//4.toString()

public class WrapperClassUSage {
	
	public static void main(String[] args) {
		
		//valueOf
		//constructor usage of wrapper class
		//by this method also we can create the object for the primittive type
		Integer i1 = new Integer(10);
		Integer i2 = new Integer("10");
		
		//usage of utility methods to create  wrapper object
		//tBelow methods need to be used in real time rather than above which uses new, both will give same output
		Integer i3 = Integer.valueOf(10);
		Integer i4 = Integer.valueOf("10");
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println();
		System.out.println(i3);
		System.out.println(i4);
		
		Double d1 = Double.valueOf(10.5);
		Boolean b1 = Boolean.valueOf("dhine");
		Character c1 = Character.valueOf('a');
		
		System.out.println(d1);
		System.out.println(b1);
		System.out.println(c1);
		
		//wrapper to primitive
		System.out.println(d1.doubleValue()); //converting the wrapper to primitive
		
		System.out.println("examples of wrapper to primitive");
		Integer il = new Integer(130);
		//every number warpper class(Byte,short,Integer,Long,Float,Double) contains the following 6 XXXXValue() method to convert the wrapper object to primitive type
		System.out.println(il.byteValue()); // range -128 to 127 byte value after 127 it starts with -128,-127,-126
		System.out.println(il.shortValue());
		System.out.println(il.intValue());
		System.out.println(il.longValue());
		System.out.println(il.floatValue());
		System.out.println(il.doubleValue());
		
		//character //boolean
		System.out.println("Character");
		Character c2 = new Character('c');
		System.out.println(c2.charValue());
		
		System.out.println("Boolean");
		
		Boolean b2 = Boolean.valueOf("dhine");
		System.out.println(b2.booleanValue());
		
		//parsexxx() -> to convert the String("10") into primitive(10)
		
		System.out.println("parsexxxx");
		
	    int im = Integer.parseInt("10");
	    System.out.println(im);
	    
	    //int is = Integer.parseInt("sdsf");
	    //System.out.println(is);
	    
	    boolean bo = Boolean.parseBoolean("TruE");
	    System.out.println(bo);
	    
	    short s1 = Short.parseShort("100");
	    System.out.println(s1);
		
	    //toString()
	    System.out.println("to string");
	    Integer ik = Integer.valueOf("10");
	    System.out.println(ik);
	    
	    
	    String sk = Integer.toString(10);
	    System.out.println(sk);
		
	    String bk = Boolean.toString(true);
	    System.out.println(bk);
		
	    String sw = Character.toString('a');
	    System.out.println(sw);
	    
	    //Auto boxing and auto unboxing
	    Integer ij = 10; //this is equal to Integer.valueOf(10) compiler automatically will do this support
		
		
		
		
		
		
	}

}
