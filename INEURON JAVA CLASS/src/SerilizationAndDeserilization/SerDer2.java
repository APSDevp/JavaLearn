package SerilizationAndDeserilization;

import java.io.*;

//here one object is calling another one which has relation so all will be serilized so all class needs to be serilized

class Dog1 implements Serializable{
	
	Cat1 c1 = new Cat1();
}

class Cat1 implements Serializable
{
	Rat r = new Rat();
	}


class Rat implements Serializable{
	int i = 10;
}
public class SerDer2 {

	public static void main(String[] args) throws Exception {
		
		
	  Dog1 d = new Dog1();
	  
	System.out.println("Serilization Started");
	
		
		FileOutputStream fos = new FileOutputStream("dogcatrat.ser");
	
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		
		oos.writeObject(d);
		
        System.out.println("Serilization ended for DogCatRat");
		
		System.out.println("----------------De-Serilization Started----------------");
		
		FileInputStream fis = new FileInputStream("dogcatrat.ser");
		
	    ObjectInputStream ois = new ObjectInputStream(fis);
	    
	    Dog1 d2 = (Dog1)ois.readObject();
	    
	    System.out.println(d2.c1.r.i);
	    
	    System.out.println("********************Deserilization ended*****************");
		
	  
	}

}
