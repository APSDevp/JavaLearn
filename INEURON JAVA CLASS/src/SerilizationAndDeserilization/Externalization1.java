package SerilizationAndDeserilization;

import java.io.*;

class Demoj implements Externalizable{
	
	String s; int i; int j; 
	
	public Demoj(String s, int i, int j) {
		this.s=s;
		this.i=i;
		this.j=j;
	}
	
	public Demoj() {
		System.out.println("constructor called");
	}
	

	
	//callback method
	public void writeExternal(ObjectOutput oo) throws IOException
	{
		oo.writeObject(s);
		oo.writeInt(i);
		
	}
	
	public void readExternal(ObjectInput oi) throws IOException, ClassNotFoundException
	{
		s =(String)oi.readObject();
		i= oi.readInt();
		
	}

	}

public class Externalization1 {

	public static void main(String[] args) throws Exception {
		
		
	       Demoj d = new Demoj("Dhinesh",10,100);

			
			System.out.println("Serialization started");
			
			
			FileOutputStream fos = new FileOutputStream("doganimal.ser");
		
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			
			oos.writeObject(d);
			
			
		       System.out.println("Serilization ended for account");
				
				System.out.println("----------------De-Serilization Started----------------");
				
				FileInputStream fis = new FileInputStream("doganimal.ser");
				
			    ObjectInputStream ois = new ObjectInputStream(fis);
			    
			    Demoj d2 = (Demoj)ois.readObject();
			    
			    System.out.println("********************Deserilization ended*****************");
			    
			 System.out.println(d2.s);
			 System.out.println(d2.j); //not seralized
			    
		

	}

}
