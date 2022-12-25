package SerilizationAndDeserilization;

import java.io.*;

class Account implements Serializable{
	
	
	String name = "Dhinesh";
	transient String password ="aps";
	transient int pin =6666;
	
	
	private void writeObject(ObjectOutputStream oos) throws Exception{
		
		System.out.println("Hey I am getting called during the serialiation");
		
		oos.defaultWriteObject();
		
		String enpwd = 123+password;
		
		int epin = 1234+pin;
		
		oos.writeObject(enpwd);
		
		oos.writeInt(epin);
		
	}
	
	private void readObject(ObjectInputStream ois) throws Exception{
		
		System.out.println("Hey I am getting called during the DeSerilization");
		
		ois.defaultReadObject();
		
		String enpwd = (String)ois.readObject();
		
		int enpin = ois.readInt(); //1234+6666
		
		password= enpwd.substring(3);
		
		pin = enpin - 1234;
	}
}

public class SrDer3Customized {

	public static void main(String[] args) throws Exception {
		
		Account acc = new Account();
		
		System.out.println("Serialization started");
		
		
		FileOutputStream fos = new FileOutputStream("account.ser");
	
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		
		oos.writeObject(acc);
		
		
	       System.out.println("Serilization ended for account");
			
			System.out.println("----------------De-Serilization Started----------------");
			
			FileInputStream fis = new FileInputStream("account.ser");
			
		    ObjectInputStream ois = new ObjectInputStream(fis);
		    
		    Account acc1 = (Account)ois.readObject();
		    
		    System.out.println("********************Deserilization ended*****************");
		    
		    System.out.println("Password is "+acc1.password + " name is "+ acc1.name+" accnt pin is "+acc1.pin);
		

	}

}
