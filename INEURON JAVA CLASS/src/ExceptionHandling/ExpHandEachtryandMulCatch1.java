package ExceptionHandling;

import java.util.Scanner;

public class ExpHandEachtryandMulCatch1 {
	
	{
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
		catch(ArithmeticException e) {   //user defined exception handler
			System.out.println("Please provide non-zero denominator");
		}
		
		
		//Array
		try {
		System.out.println("Enter the size of the array : ");
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		
		int ar[] = new int[size];
		
		
		System.out.println("Enter the Element to be added in ar: ");
		int elm = scan.nextInt();
		
		System.out.println("Enter the position at which elem to be added: ");
		
		int pos = scan.nextInt();
		
		ar[pos] = elm;
		}
		catch(NegativeArraySizeException e) {   //user defined exception handler
			System.out.println("Please privide the array positive values");
		}
		catch(ArrayIndexOutOfBoundsException e) {   //user defined exception handler
			System.out.println("Please privide the position value within the range of array of ");
		}
		
		System.out.println("Thanks for using the application");
		}
		
	}


