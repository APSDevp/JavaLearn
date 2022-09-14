package ManyToMany;

public class TestAppMM {
	
	public static void main(String[] args) {
		
		//create dependent object
		
		course cr1 = new course(101, "JAVA", 250);
		course cr2 = new course(102, "Python", 200);
		course cr3 = new course(103, "Java Script", 300);
		
		//creating array to perform many Association to the target object
		
		course[] course= new course[3];
		course[0]=cr1;
		course[1]=cr2;
		course[2]=cr3;
		
		//second array
		course[] course2= new course[2];
		course2[0]=cr1;
		course2[1]=cr2;
		
		Student s1 = new Student(10,"Dhinesh", 27, course);
		Student s2 = new Student(11,"FET", 28, course2);
		Student s3 = new Student(12,"Quest", 29, course);
		
		s1.getStudentDetails();
		System.out.println("--------------------");
		
		s2.getStudentDetails();
		System.out.println("--------------------");
		
		
		s3.getStudentDetails();
		System.out.println("--------------------");
		
		
	}

}
