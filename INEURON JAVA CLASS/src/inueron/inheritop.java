package inueron;

class A extends Object {  // by default Object is default class - show(), wait(), obj. to see the methods
	
	int i = 5;
	
	public void show() {
		System.out.println("in A Show");
	}
}

class B extends A{	//here also Object will be extended , kind of multi level inhertitance
	
	int i =9; //first JVM will check in own class, if not then it goes to parent
	
	public void disp() {
		int i = 10;
		System.out.println(i);
		System.out.println(this.i); // represent the object which is B i=9 (b.i)
		System.out.println(super.i);// represent the super class  which is A i=5
	}
}

public class inheritop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();
		obj.show();
		obj.disp();
		//obj.i=7;
		//System.out.println(obj.i);
		

	}

}
