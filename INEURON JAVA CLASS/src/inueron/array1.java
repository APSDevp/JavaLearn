package inueron;
import java.util.Scanner;

public class array1 {
	
	public static void main(String args[]) {
		
		int []a=new int[5];
		System.out.println(a.length);
		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<a.length;i++) {
			
			System.out.println("Please enter the marks for the student "+ i);
			
			a[i]=scan.nextInt();
		}
		
		System.out.println("The marks for the students are");
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+ " ");
		}
	}

}
