package Innerclass;

public class MethodLocalinnerclass01 {
	
	int d = 20; //instance variable
	static int h = 25;
	
	public  void m1() { //if here static only static variables fro above can be accessed, so d will fail and h will work
		
		int v = 150; //local variable
		
		class Inner{ //local,abstract,strictfp can be used as access modifiers
			public void sum(int x, int y) { //inside the inner class static element is not permitted so we can't use static  void sum()
				
				System.out.println("The sum is :: "+ (x+y));
				System.out.println(d);
				System.out.println(h);
				System.out.println(v);
				
			}
			
		}
		
		Inner i1 = new Inner();
		i1.sum(5, 6);
		Inner i2 = new Inner();
		i2.sum(100, 200);
	}

	public static void main(String[] args) {
	
		
		 MethodLocalinnerclass01 met = new  MethodLocalinnerclass01();
		 met.m1();
	}

}
