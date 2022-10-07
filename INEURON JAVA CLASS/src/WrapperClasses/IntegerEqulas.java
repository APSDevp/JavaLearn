package WrapperClasses;

public class IntegerEqulas {

	public static void main(String[] args) {
		Integer x =10;
		Integer y = 10;
		
		System.out.println(x==y); //true
		
		Integer x1 =1000;
		Integer y1 = 1000;
		//while using the wrapper(Auto boxing) there is buffer created which is in byte length, so -218 to +127, so 
		//the value within the range will be in same reference
		
		//byte,short, int, long, float, double - the buffere concept which internally jvm maintains is "byte range only"
		
		System.out.println(x1==y1); //false
		
		int x2 = 10;
		int y2 = 10;
		
		System.out.println(x2==y2);
		
		String s1 = "gell";
		String s2 = "gell";
		System.out.println(s1==s2);
		

	}

}
