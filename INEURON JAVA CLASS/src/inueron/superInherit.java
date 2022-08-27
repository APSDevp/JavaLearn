package inueron;

class X {
	
	   private int sal;
	
	public X() {
		super(); // here it will callObject class which is default
		System.out.println("in X");
	}
	
	public X(int a) {
		super();
		System.out.println("int x Int");
	}
	
}

class Y extends X { // WHENEVER WE CREATE object FOR BASE IT WILL ALSO CALL CONSTRUCTOR OF SUPER CLASS
	
	public Y() {
		super(6);
		System.out.println("in Y");
	}
	
	public Y(int a) {
		super(6);         // be default super in there in all constructor even we don't mention in constructor it should be in first line
		//if we didn't specify the parameter it will call call normal constructor
		System.out.println("in Y int");
	}
	
}
public class superInherit {

	public static void main(String[] args) {
		
		Y obj = new Y(); // first call constructor of Y but inside it there will be call of constructor of parent class which is default
		// if we specify the paramter it will call paramerized cobstructor else it will call normal constructor
		
		//private can't be accessed 
        //obj.sal = 10; //*****8
	}

}
