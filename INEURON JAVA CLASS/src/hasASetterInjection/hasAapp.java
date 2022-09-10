package hasASetterInjection;



public class hasAapp {
	

	public static void main(String[] args) {
		
		//creating dependent object
		account acct = new account();
		
		//performing setter injection to inject the values
		acct.setAccHolderName("Dhinesh");
		acct.setAccNo("HDFC-7060");
		acct.setAccType("Saving Constructor");
		
		
		//create a target object and inject the dependent object in the constructor
		Employee employee = new Employee();
		
		employee.setEaddress("TN");
		employee.setEid(1235);
		employee.setEname("Dhinesh");
		
		
		//Performing setter injection to the account
		employee.setAccount(acct);
		

		
		employee.display();


	}

}
