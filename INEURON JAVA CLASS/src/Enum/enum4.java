package Enum;

enum Result1{ //an internal class gets created
	
	PASS,FAIL,NR;
	
	//public final static Result1 pass=new Result();
	
	Result1(){
		
		//it will print 3 times as we have 3 const values, coz it will create 3 objects and invoke the constructor
		//doubt - still why it creates 3 even we invoking single PASS
		System.out.println("Lets see how many times it gets executed");
	}
}

public class enum4 {

	public static void main(String[] args) {
	
		Result1 r = Result1.PASS;
		
		//We can't create object of enum explicitily
		
		//>jdk1.5 we can pass enum to switch case
		switch(r){
		case PASS: System.out.println("Passed");
		break;
		case FAIL: System.out.println("Failed");
		break;
		case NR: System.out.println("No Result");
		break;
		}

	}

}
