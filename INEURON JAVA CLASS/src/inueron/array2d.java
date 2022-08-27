package inueron;
import java.util.Scanner;

public class array2d {
	
	public static void main(String args[]) {
		
	Scanner scan = new Scanner(System.in);
	  
	         int [][]arr= new int[3][4];  //3 class are with 4 students each
	         System.out.println(arr.length);
	         
	         for(int i =0;i<arr.length;i++) {
	        	 
	        	 for(int j=0;j<arr[i].length;j++) {
	        		 
	        		 System.out.println("Enter the marks of the class "+ i +"Students" + j);
	        		 arr[i][j]=scan.nextInt();
	        	 }
	         }
	         
	        System.out.println("the marks of the students are");
	        for(int i =0;i<arr.length;i++) {
	        	 
	        	 for(int j=0;j<arr[i].length;j++) {
	        		 
	        		 System.out.println(arr[i][j] + " ");
	        	 }
	        	 System.out.println(" ");
	         }
	        
	
	}
	
}
