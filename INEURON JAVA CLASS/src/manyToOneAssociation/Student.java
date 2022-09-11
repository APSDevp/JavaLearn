package manyToOneAssociation;

public class Student {
	
	private int sid;
	private String sname;
	private int sage;
	
	//Has-a variable
	private Branch branch;

	//Constructor
	public Student(int sid, String sname, int sage, Branch branch) {
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
		this.branch = branch;
	}
	
	public void getStudentDetails(){
		System.out.println("Student details are :: ");
		System.out.println("SID is  ::"+sid);
		System.out.println("Sage is ::"+sage);
		System.out.println("Sage is ::"+sname);
		
		System.out.println("---------------------------");
		System.out.println("Branch details are :: ");
		System.out.println("Branch id id ::"+branch.getBid());
		System.out.println("Branch location is ::"+branch.getBloc());
		
	}

	
	

}
