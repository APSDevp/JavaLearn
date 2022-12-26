package SerilizationAndDeserilization;

import java.io.*;

public class SerialVersionUIDReciever {

	public static void main(String[] args) throws Exception {
		

			
			System.out.println("----------------De-Serilization Started----------------");
			
			FileInputStream fis = new FileInputStream("serialversion1.ser");
			
		    ObjectInputStream ois = new ObjectInputStream(fis);
		    
		    SerialVersionUID1 svu2 = ( SerialVersionUID1)ois.readObject();
		    
		    System.out.println("********************Deserilization ended*****************");
		    
		    System.out.println(svu2.i);

	}

}
