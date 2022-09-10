package inueron.entities;

public class hasAaccandemployeeApp {

	public static void main(String[] args) {
		
		//constructor injection
		//injecting value for dependent class through constructor 
		hasAaccountType Account =	new hasAaccountType("HDFC-123", "Savings", "Dhinesh");
		
		//create a target object and inject the dependent object in the constructor only
		
		hasAemployee employee = new hasAemployee(10, "Dhinesh", "TN", Account);
		
		
		//checking the data of employee
		
		employee.display();


	}

}
