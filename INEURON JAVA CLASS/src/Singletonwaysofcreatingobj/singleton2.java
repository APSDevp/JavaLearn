package Singletonwaysofcreatingobj;

class Demo{
	
	private static Demo d = null;
	
	private Demo() {}
	
    public static Demo getDemo() {
	
    	 if(d == null)
    		 
    		 d = new Demo();
    	 return d;
}
}

public class singleton2 {

	public static void main(String[] args) {
		//static factory methods
		Demo d1 = Demo.getDemo();
		Demo d2 = Demo.getDemo();
		
		System.out.println(d1 == d2);

	}

}
