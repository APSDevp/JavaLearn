package inueron;

public class stringLearn {

	public static void main(String[] args) {
		
		String str = "Dhinesh"; //mem created in SCP of heap area
		
		String str1 = "he";
		
		String str2 = "dhinesh"; 

		System.out.println(str);
		
		String newstr = new String("Hello Dhinesh"); //mem created in heap area
		
		System.out.println(newstr);
		
		//compare
		String newstr1 = "Hello Dhinesh";
		String newstr2 = new String("Dhinesh");
		System.out.println("comp");
		System.out.println(str==newstr2);
		System.out.println(str==str1); // comparing the mem address
		//equals
		System.out.println(str.equals(newstr2)); // true -- refering the value
		
		//ignorecase
		System.out.println(str.equalsIgnoreCase(str2)); // true
		
		//compare
		System.out.println(str.compareTo(newstr2)); // output is 0 cmp charcter by charc - ascii values
		System.out.println(str.compareTo(str2)); // outpu is -32
		
		String newval = " How are you ";
		System.out.println(newstr1 + newval + 99); //if number is added to string then it will act as string
		
		//various string methods
		
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		System.out.println(str1.charAt(1)); //to access the index of string, we can't access index directly like s1[3]
		System.out.println(newstr.substring(0,5));  //from 0 i want till 5th char
		System.out.println(newstr.endsWith("Dhinesh"));
		

		
	}

}
