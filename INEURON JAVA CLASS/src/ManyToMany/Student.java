package ManyToMany;

public class Student {

	private int sid;
	private String sname;
	private int sage;
	
	//HAS-A Variable
	private course[] courses;
	
	
	public Student(int sid, String sname, int sage, ManyToMany.course[] courses) {
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
		this.courses = courses;
	}


	public void getStudentDetails(){
		System.out.println("Student details are :: ");
		System.out.println("SID is  ::"+sid);
		System.out.println("Sage is ::"+sage);
		System.out.println("Sage is ::"+sname);
		
		System.out.println("---------------------------");
		System.out.println("Course details are :: ");
		
		for (course course : courses) {
			
			System.out.println("CID is :: " + course.getCid());
			System.out.println("CNAME is ::"+ course.getCname());
			System.out.println("COST is ::"+ course.getCost());
			
			
		}

		
	}

}
