package interFaceConcepts;

import java.util.Scanner;

interface Calculator{
	void sum(); //by default interface method is public and abstract
	void sub();
}


//we should implement the methods declared in Calculator class

class myCalc1 implements Calculator {  
	
	public void sum() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter 1st Number to add:  ");
		int a = scan.nextInt();
		System.out.println("Please Enter 2nd Number to add:  ");
		int b = scan.nextInt();
		int c = a + b;
		System.out.println("The Addtion of two number is: "+ c);
		
		
		
	}
	public void sub() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter 1st Number to sub:  ");
		int a = scan.nextInt();
		System.out.println("Please Enter 2nd Number to sub:  ");
		int b = scan.nextInt();
		int c = a - b;
		System.out.println("The Addtion of two number is: "+ c);
		
	}	
}

class myCalc2 implements Calculator{
	
	public void sum(){
		
		int a =10;
		int b =20;
		
		int c = a+b;
		System.out.println("The value of addition is: "+c);
		
	}
	
	public void sub() {
		int a =10;
		int b =20;
		
		int c = a-b;
		System.out.println("The value of subtraction is: "+c);
		
	}
	
	
}

//polymorpism
//we can create reference on interface class

class PolyCal {
	
	public void Arithmetic(Calculator p) {
		p.sum();
		p.sub();
	}
}
public class CalcApp1 {

	 public static void main(String[] args) {
		 
		 myCalc1 cal1 = new myCalc1();
		 myCalc2 cal2 = new myCalc2();
		 
		 PolyCal arth = new PolyCal();
		 
		 arth.Arithmetic(cal1);
		 arth.Arithmetic(cal2);
		 
		 //Calculator pl =  new myCalc1();

		 
		 
	 }
}
