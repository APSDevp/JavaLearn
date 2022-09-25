package ExceptionHandling;

import java.util.Scanner;

public class ExpHand1 {

	public static void main(String[] args) {
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
		catch(Exception e) {   //user defined exception handler
			System.out.println("Please provide non-zero denominator");
		}
		
		System.out.println("After the try and catch");

	}

}
