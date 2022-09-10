package oneToManyAssociation;

public class Employee {
	
	//Instance variable
	private int id;
	private String name;
	
	//constructor injection
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
 
	//getters to get the value
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	
	
	

}
