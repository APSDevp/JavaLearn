package ExceptionHandling;

import java.util.Scanner;

public class ExpHand2 {
	

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
		
		//Array
		
		System.out.println("Enter the size of the array : ");
		
		int size = scan.nextInt();
		
		int ar[] = new int[size];
		
		System.out.println("Enter the Element to be added in ar: ");
		
		int elm = scan.nextInt();
		
		System.out.println("Enter the position at which elem to be added: ");
		
		int pos = scan.nextInt();
		
		ar[pos] = elm;
		
		
		
		
		System.out.println("Thanks for using the application");
		}
		catch(ArithmeticException e) {   //user defined exception handler
			System.out.println("Please provide non-zero denominator");
		}
		catch(NegativeArraySizeException e) {   //user defined exception handler
			System.out.println("Please privide the array positive values");
		}
		catch(ArrayIndexOutOfBoundsException e) {   //user defined exception handler
			System.out.println("Please privide the position value within the range of array of ");
		}
		catch(Exception e) {
			System.out.println("Please enter the proper input");
		}

		
		System.out.println("After the try and catch");

	}

}
