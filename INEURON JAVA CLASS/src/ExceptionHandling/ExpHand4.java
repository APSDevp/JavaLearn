package ExceptionHandling;

import java.util.Scanner;

class Alpha {
	
	public void division() {
		try {
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
		catch(ArithmeticException e) {   //user defined exception handler
			System.out.println("Please provide non-zero denominator");
		}
		
		}
	}
	

class Beta {
	public void disp() {
		
		Alpha a = new Alpha();
		try {
		a.division();
		}
		catch(ArithmeticException e) {   //user defined exception handler
			System.out.println("Please provide non-zero denominator");
		}
		
	}
}


public class ExpHand4 {

	public static void main(String[] args) {
		
		Beta b = new Beta();
		b.disp();
	}

}
