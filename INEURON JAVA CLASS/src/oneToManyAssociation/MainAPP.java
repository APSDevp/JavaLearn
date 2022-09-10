package oneToManyAssociation;

public class MainAPP {
	
	public static void main(String[] args) {
		
		//creating dependent object using the constructor injection
		Employee emp1 = new Employee(10,"Dhinesh");
		Employee emp2 = new Employee(11,"Palanisamy");
		Employee emp3 = new Employee(12,"FETQuest");
		Employee emp4 = new Employee(13,"APS");
		
		
		//creating an Array to perform one-many association
		Employee[] employees = new Employee[4];
		employees[0] = emp1;
		employees[1] = emp2;
		employees[2] = emp3;
		employees[3] = emp4;
		
		//creating target using constructor
		
		Department department =new Department(0, "THE FET", "TN", employees);
		
		department.display();
	}

}
