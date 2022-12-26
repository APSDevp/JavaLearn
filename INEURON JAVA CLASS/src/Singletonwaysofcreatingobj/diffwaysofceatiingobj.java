package Singletonwaysofcreatingobj;

class student{
	
	static {
		System.out.println("student class loading");
	}
	
	public student() {
		System.out.println("student object got created");
	}
}

public class diffwaysofceatiingobj {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException  {
		
		//runtime the class name will come plz create the object
		
		//args[0] = "java.lang.String";
		
		//String data = (String)(Class.forName(args[0]).newInstance());
		
		//have to pass the class- Student from command line
		//javac diffwaysofceatiingobj student
		student std = (student)Class.forName(args[0]).newInstance();

	}

}
