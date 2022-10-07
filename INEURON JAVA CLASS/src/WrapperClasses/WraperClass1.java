package WrapperClasses;

public class WraperClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer i1 = new Integer(10);
		//Integer i2 = new Integer("ten"); //will create the error - NumberFormatEception
		//if the string input is not properly formatted, mean if it is not representing any number then will get an Exception called "NumberFormatException"
		System.out.println(i1);
		//System.out.println(i2);
		
		Character c1 = new Character('a');
		System.out.println(c1);
		//character only accepts one primitive parameter which is single char
		
		Boolean b = new Boolean(true);
		System.out.println(b);
		//accepts only "true" and "false"
		Boolean c = new Boolean("False");
		System.out.println(c);
		//accepts "True" and "Flase" - string argument constructor
		//in boolen whatever we gives it is case-in-sensitive
		
		Boolean d = new Boolean("no");
		System.out.println(d);
		
		//**** if we are passing String argument, then case is not important and content is important.
		//if the content is case insensitive String of the true then it is treated as true in all the other cases it is false
		
		Integer i3 =new Integer(10);
		System.out.println(i1.equals(i3));
		
		//equals() method is also overriden in all wrapper class to compare the content
		
		
		


	}

}
