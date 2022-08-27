package inueron;

import java.util.Scanner;

public class ruggedarray {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		  
		         int [][]arr= new int[3][];  //3 class are with 4 students each
		         arr[0] = new int[3];
		         arr[1] = new int[2];
		         arr[2] = new int[3];
		         
		         System.out.println(arr.length);
		         
		         for(int i =0;i<arr.length;i++) {
		        	 
		        	 for(int j=0;j<arr[i].length;j++) {
		        		 
		        		 System.out.println("Enter the marks of the class "+ i +" Students " + j);
		        		 arr[i][j]=scan.nextInt();
		        	 }
		         }
		         
		        System.out.println("the marks of the students are");
		        for(int i =0;i<arr.length;i++) {
		        	 
		        	 for(int j=0;j<arr[i].length;j++) {
		        		 
		        		 System.out.print(arr[i][j] + " ");
		        	 }
		        	 System.out.println();
		         }
		        
		
		}

}
