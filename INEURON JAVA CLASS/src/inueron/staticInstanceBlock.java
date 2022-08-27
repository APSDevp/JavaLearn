package inueron;

class Alien {
	
	private int age;
	private String name;
	
	static int count;
	{
		count++; //to know the no of object is created, we can use instance block rather than implying in each constructor
		}
	
	Alien() { 
		//count++;
	}
	
	Alien(int age){
		
		this.age = age;
		//count++;
	}
	
	Alien(int age, String name){
		this.age = age;
		this.name = name;
		//count++;
	}
}

public class staticInstanceBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alien a1 = new Alien();
		Alien a2 = new Alien(10);
		Alien a3 = new Alien(10, "dhi");
		System.out.println(Alien.count);

	}

}
