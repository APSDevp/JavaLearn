package Innerclass;


public class staticNestedclass01 {
	
	static class Nested { //inner static class - having static variables inside the static class is called nested static class
		
		int x =10;
		static int y = 20;
		
		public void m1() {
			System.out.println("instance method inside the static nested class");
		}
		
		
		public static void m2() {
			System.out.println("instance method inside the static nested class m2");
		}
		
		public static void main(String[] args) {
			System.out.println("Main Method of static nested class");}
	}

	public static void main(String[] args) {
		System.out.println("Main Method");
		
		staticNestedclass01.Nested n = new staticNestedclass01.Nested();//calling static class method using this way
		
		n.m1();
		n.m2();

	}

}
