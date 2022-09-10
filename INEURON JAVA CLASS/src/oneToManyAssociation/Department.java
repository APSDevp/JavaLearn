package oneToManyAssociation;

public class Department {
	
	private int deptNo;
	private String deptName;
	private String deptloc;
	
	//HAS A Variable
	private Employee[] employees;
	
	
   //Performing Constructor injection
	public Department(int deptNo, String deptName, String deptloc, Employee[] employees) {
		super();
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.deptloc = deptloc;
		
		//HAS-A variable injection through constructor
		this.employees = employees;
	}
	
	
	
	public void display() {
		
		System.out.println("********Depratment Details**********");
		System.out.println("Dept no is   ::"+ deptNo);
		System.out.println("Dept name is   ::"+ deptName);
		System.out.println("Dept location is   ::"+ deptloc);
		
		System.out.println("**********************************************************");
		System.out.println("*************Employee Details*****************************");
		
		for(Employee employee : employees) {
			System.out.println("Employee ID  ::" + employee.getId());
			System.out.println("Employee Name  ::" + employee.getName());
		}
	}
	
	

}
