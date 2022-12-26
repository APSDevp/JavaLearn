package SerilizationAndDeserilization;

import java.io.*;

public class SerialVersionUIDSender {

	public static void main(String[] args) throws Exception {
		
		
	    SerialVersionUID1 svu = new SerialVersionUID1();
	    
		System.out.println("Serialization started");
		
		
		FileOutputStream fos = new FileOutputStream("serialversion1.ser");
	
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		
		oos.writeObject(svu);
		
		System.out.println("Serialization ended");

	}

}
