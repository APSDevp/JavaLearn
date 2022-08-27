package inueron;

public class staticClassv2 {
	
	static int a, b, c;

	static
	{
		System.out.println("Static block");
		a=10;
		b=20;
		c=30;
	}
	
	static void disp1() {
		System.out.println("Static Method");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}
	
	staticClassv2 (){
		System.out.println("constructor call");
	}
	
	
	int m,n,o;
	
	//instance intialization method
	{
		System.out.println("non static block");
		m=100;
		n=200;
		o=300;
		a=50;
		b=40;  
	}
	
	void disp2() {
		System.out.println("non static method");
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
		//invoking static in non static
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method");
		disp1();
		staticClassv2 l = new staticClassv2();
		l.disp2();
	}

}
