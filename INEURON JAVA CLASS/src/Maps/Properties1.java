package Maps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class Properties1 {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		Properties p = new Properties(); //properties object is created
		
		//key value is stored as string 
		
		//creating a FileInputStream to read the data from a file called "database1.properties"
		
		FileInputStream fis = new FileInputStream("C:\\Users\\HI\\git\\JavaLearn\\INEURON JAVA CLASS\\src\\database1.properties");
		//C:\Users\HI\git\JavaLearn\INEURON JAVA CLASS\src\database1.properties
		
		
		//data lodaded into properties object
	    try {
			p.load(fis);
			System.out.println(p);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	   System.out.println("Url is : : "+p.getProperty("url"));
	   System.out.println("username is : : "+p.getProperty("username"));
	   System.out.println("password is : : "+p.getProperty("password"));
	   
	   //to write to the file
	   p.setProperty("The Fet Quest", "Dhinesh");
	   
	   FileOutputStream fout=new FileOutputStream("C:\\Users\\HI\\git\\JavaLearn\\INEURON JAVA CLASS\\src\\database1.properties");
	   
	   try {
		p.store(fout, "Map operations got concluded");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   System.out.println(p);

	}

}
