package Innerclass;

class outer2{ //public,default,final,abstract,strictfp
	
	int x = 10; //instance variable
	static int y = 20; //static variable
	int h =54;
	
 	class inner2{ //class executes in heap area , //public,default,final,abstract,strictfp,private,static, protected
		
		int h =15; //instance variable of the inner class
		
		public void m1() {
			int h = 100; //local variable of inner class method m1() //method executes in stack area
			System.out.println("Inside inner class m1()");
			int z = x + y;
			System.out.println(z);
			System.out.println(h); //100
		    System.out.println(this.h); //15 --gives the instance value --to access the instance variable use the 'this' keywaord
		    System.out.println(outer2.this.h); //to access the outer class variable inside the inner class method
		}
	}
}

public class regularInnerclass2 {

	public static void main(String[] args) {
		
		System.out.println("From the main class");
		
		new outer2().new inner2().m1(); //when memory maps create it also include the instance and static variable

	}

}
