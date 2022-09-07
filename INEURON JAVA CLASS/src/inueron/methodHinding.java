package inueron;

class parent1 {
	public static void disp() {
		System.out.println("It's is parent class");
	}
}

class child1 extends parent1 {
	
	public static void disp() {
		
		System.out.println("it's child class");
		
	}
}
public class methodHinding {
	public static void main(String args[]) {
		child1 c1 = new child1();
		parent1 p1 = new parent1();
		parent1 c2 = new child1(); //method hiding, static method will inherit the parent class but not overide so even though we created obj for child it will use the parent method and the child method will act as specialized method
		c1.disp();
		p1.disp();
		c2.disp();
	}

}
