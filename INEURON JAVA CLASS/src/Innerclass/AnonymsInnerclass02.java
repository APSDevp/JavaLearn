package Innerclass;

class PopCorn{
	
	public void taste() {
	    
		System.out.println("spicy");
	}
}

public class AnonymsInnerclass02 {

	public static void main(String[] args) {
		
		     PopCorn m = new PopCorn(); //creating object for the popcorn
		
             PopCorn p = new PopCorn() { //child class type can be referenced using the parent class
            	 
             }; //here we are extending the child class object of popcorn without name and for that child class we are creating an with parents reference popcorn
             
             
             //here we extending without knowing the class name {} so it is called anonyms class
             
             //creating the child class for popcorn "new PopCorn() {"
             //overriding taste method()
             //creating an object of child class and collecting it through parent reference "PopCorn k" 
             PopCorn k = new PopCorn() { //class created without name it is like class ** extends Popcorn but ** no class name given
            	
            	 @Override         //overriding the parent class method
            	 public void taste() {
            		 System.out.println("salty");
            		 m1();
            	 }
            	 
            	 
            	 public void m1() { //this method is not present in parent as we using the parent reference but we can call from the inner class as m1();
            		 System.out.println("specilized Method");
            	 } 
            	 
             };
             
             k.taste();
            // k.m1();
             
             System.out.println(k.getClass().getName());
             
	}

}
