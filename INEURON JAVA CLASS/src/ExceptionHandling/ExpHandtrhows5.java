package ExceptionHandling;

import java.util.Scanner;

class Alpha1 {
	
	public void division() throws ArithmeticException {
		System.out.println("Exception Handling for Division");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ener the numerator number to divide: ");
		
		int a=scan.nextInt();
		
		System.out.println("Ener the denominator number to divide: ");
		
		int b=scan.nextInt();
		
		int result = a/b;
		
		System.out.println("The Result is: "+result);
		
		System.out.println("Thanks for using the application");
		
		
		}
	}
	

class Beta1 {
	public void disp() {
		
		Alpha1 a = new Alpha1();
		a.division();
		}
}



public class ExpHandtrhows5 {
	public static void main(String[] args) {
		try {
		Beta1 b = new Beta1();
		b.disp();
		}
		catch(ArithmeticException e) {   //user defined exception handler if we didn't handle in Alpha, JVM will look over here.
			System.out.println("Please provide non-zero denominator");
		}
		
	}
}
