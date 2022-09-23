package LambdaFunctionalinterface;

@FunctionalInterface
interface Alpha1{

	void beta();
}

//anonyms innerclass
public class innerlamba2 {

	  public static void main(String args[]) {
		  
		  Alpha1 a1 = new Alpha1()
		  {
			  public void beta() //implementation for a Interface as inner class
			  {
				  System.out.println("Hello Inner Anonyms class");
			  }
		  }; //; here means implemention and ends
		  
		 a1.beta(); //invoking the method via inner class
		  
	  }
	  

}
