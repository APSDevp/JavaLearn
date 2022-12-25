package SerilizationAndDeserilization;

import java.io.*;


class Dog implements Serializable {
	
	int i = 10;
	transient int j = 20; //this variable won't be part of serilization if we add "transient" keyword before the variable names
	static transient int f = 15;
	//used when confidential data is part of variable like username and password
	//not-to serialize
	//jvm ignores
	Dog(){
		System.out.println("Dog Constructor is called");
	}
}

class Cat implements Serializable {
	int k = 20;
	int l = 25;
	
	
	Cat(){
		System.out.println("Cat Constrctor is called");
	}
}
public class SerDer1 {

	public static void main(String[] args) throws IOException,ClassNotFoundException {
	   
		Dog d = new Dog();
		
		Cat c = new Cat();
		
		System.out.println("Serilization Started");
		
		//Step 1 for serilization
		
		FileOutputStream fos = new FileOutputStream("dogcat.ser");
		
		//step 2 - attach above file to the objectOutputstream
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		//step 3 -> write the obeject into objectStream
		
		oos.writeObject(d);
		oos.writeObject(c);

		System.out.println("Serilization ended for Dog");
		
		System.out.println("----------------De-Serilization Started----------------");
		
		
		//Step 1 for De-serilization
		
		FileInputStream fis = new FileInputStream("dogcat.ser");
		
	
		
		 ObjectInputStream ois = new ObjectInputStream(fis);
		
	
		
		Dog d1 = (Dog)ois.readObject(); //to convert the dog type of ser we have to show jvm the .class file looks like
		Cat c1 = (Cat)ois.readObject();
		//data is coming from Deserilzed file
		System.out.println(d1.i);
		System.out.println("The Transient variable value is "+d1.j); //no impact
		System.out.println("The Transient static variable value is "+d1.f);//no impact
		System.out.println(c1.k);
		
		
		//order should be preserved, if first dog got serilized then it should be first to de-serilized
          
		
		//final and static won't have any impact on transient as the compiler assigns the value directly so it will print the value
	}

}
