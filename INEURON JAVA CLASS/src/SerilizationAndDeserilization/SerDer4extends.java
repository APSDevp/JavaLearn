package SerilizationAndDeserilization;

import java.io.*;

class Animal{
	
	int i = 10;
	
	Animal(){
		
		System.out.println("Animal class Constructor");
	}
}

class Dog3 extends Animal implements Serializable{
	
	int j = 20;
	
	Dog3(){
		System.out.println("Dog class Constructor");
	}
	
	
}

public class SerDer4extends {

	public static void main(String[] args) throws Exception {
		
       Dog3 dc = new Dog3();
       dc.i = 888;
       dc.j = 999;
		
		System.out.println("Serialization started");
		
		
		FileOutputStream fos = new FileOutputStream("doganimal.ser");
	
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		
		oos.writeObject(dc);
		
		
	       System.out.println("Serilization ended for account");
			
			System.out.println("----------------De-Serilization Started----------------");
			
			FileInputStream fis = new FileInputStream("doganimal.ser");
			
		    ObjectInputStream ois = new ObjectInputStream(fis);
		    
		    Dog3 dc1 = (Dog3)ois.readObject();
		    
		    System.out.println("********************Deserilization ended*****************");
		    
		   System.out.println("Dog object i value is "+dc1.i); //if parent class is not serialilzed, JVM will give call to default const. which uses the instance variable value
		   
		   System.out.println("Dog object j value is "+dc1.j);
		


	}

}
