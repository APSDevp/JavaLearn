package Enum;

//enum constants internally creates class for it so only we can able to access it and constructor is called each time

//it is like class Results extends enum
//enum is present inside the java.lang package

enum Results{
	
	PASS,FAIL,NR; //pre-defined constant
	
	int marks; //normal -fields
	
	//constructor
	Results() {  //only private constructors are allowed 
		System.out.println("Constutors is getting called");
	}
	
	//methods
	void setMarks(int marks) {
		
		this.marks = marks;
	}
	
	int getMarks() {
		return marks;
	}
	
}

public class enum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Results.PASS.setMarks(45);
		 
		 //here the pass will internally works as "final static PASS= new Result()
		 
		int marks=  Results.PASS.getMarks();
		
		System.out.println("The marks is "+ marks);

	}

}
