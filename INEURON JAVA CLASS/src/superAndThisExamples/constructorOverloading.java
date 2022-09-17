package superAndThisExamples;

class Cons1 {
	
	int a,b,c;
	
	public Cons1(){
		a =10;
		b=6;
		c = a+b;
	}
	
	public Cons1(int x, int y) {
		a = x;
		b = y;
		c = a + b;
	}
	
}

//all the constructor should not have #THIS method, else it will become loop between 2 constructor
//this() will call the constructor of same class
class Cons2 extends Cons1{
	int x,y,z;
	
	public Cons2(){
		x =11;
		y=7;
		z = x+y;
	}
	
	public Cons2(int f, int g) {
		
		//by default it has super(), and it will reach cons1() zero parameterized constructor
		//we have to specify the super(f,g), so it will call the parameterized constructor of
		//cons1
		//if we invoke the child class with cons2(4,5) it won't call parameterized constructor of
		//cons1. because default super() only invoke the zero parameterized of cons1
		super(f,g);
		x = f;
		y = g;
		z = x + y;
	}
	
	public void disp() {
		System.out.println(c);
		System.out.println(z);
	}
	
	
}

public class constructorOverloading {

	public static void main(String[] args) {
		
		//control will go to Con2s there super() method will be in first line, so it will go to 
		//Cons1 constructor and execute that and come back to cons2 and execute that
		
		Cons2 con = new Cons2(5,6);
		con.disp();

	}

}
