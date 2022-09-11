package manyToOneAssociation;



public class TestApp {
	
	//Driving Code
	public static void main(String[] args) {
		
		//creating a dependent object
		Branch branch = new Branch("IN01","Chennai");
		
		//Target object creation many target
		
		Student stud1 = new Student(01,"Dhinesh",27,branch);
		Student stud2 = new Student(01,"King",27,branch);
		Student stud3 = new Student(01,"Queen",27,branch);
		Student stud4 = new Student(01,"Spade",27,branch);
		
		stud1.getStudentDetails();
		System.out.println("_______________________________");
		stud2.getStudentDetails();
		System.out.println("_______________________________");
		
		stud3.getStudentDetails();
		System.out.println("_______________________________");
		
		stud4.getStudentDetails();
		
		
	
		
		
		
		
	}

}
