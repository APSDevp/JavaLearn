package ExceptionHandling;

import java.util.Scanner;

class Alpha2 {
	
	public void division() throws ArithmeticException {
		try {
		System.out.println("Exception Handling for Division");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ener the numerator number to divide: ");
		
		int a=scan.nextInt();
		
		System.out.println("Ener the denominator number to divide: ");
		
		int b=scan.nextInt();
		
		int result = a/b;
		
		System.out.println("The Result is: "+result);
		}
		catch (ArithmeticException e) {
			System.out.println("Exception happened in division method only ");
			throw e; //to throw the exception to main method
		}
		finally {
			System.out.println("Finally method is executed");
			System.out.println("Thanks for using the application");
		}
		
		
		}
	}
	


public class ExpHandRethrow1 {

	public static void main(String[] args) {
	
		System.out.println("Main Method Connection Established");
		try {
		Alpha2 a = new Alpha2();
		a.division();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Denominator value should not be zero");
		}
		

	}

}
