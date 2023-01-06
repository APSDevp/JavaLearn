package Innerclass;

public class AnonymsInneclass01 {

	public static void main(String[] args) {
	
		  //int[] arr = {10,20,30};
		  
		  display(new int[] {10,20,30}); //instance use of an array as object
          //wherever we use instance use then we can use anonyms class
		  
	}
	
	static void display(int[] a) {
		  int sum = 0;
		  for(int ele:a) {
			    sum+=ele;
			    System.out.println("The sum of an array is :: "+sum);
		  }	  
	}

}
