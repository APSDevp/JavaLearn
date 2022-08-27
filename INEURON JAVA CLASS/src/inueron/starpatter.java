package inueron;

import java.util.Scanner;

public class starpatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		
		/* for(int i = 0; i<=n;i++) {
			
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		} */
		
		/* System.out.println("hello");
		Scanner scan = new Scanner(System.in);
		System.out.println("Guessor kindly guess the number");
		 n =scan.nextInt();
		System.out.println(n);
		if(n <= 10) {
			System.out.println("The value of n is " + n);
		}else {
			n =scan.nextInt();
			
		} */
		 int val;
	while(true) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Guessor kindly guess the number");
		n =scan.nextInt();
		if(n <= 10) {
			val = n;
			System.out.println(val);
			break;
		} else
			continue;	
	}	
		

	}

}
