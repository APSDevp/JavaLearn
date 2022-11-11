package Enum;

enum Gender{
	
	MALE,FEMALE,OTHERS;
	
	//final static Gender MALE=new Gender(); //internally creates
}
public class enum3 {

	public static void main(String[] args) {

		 Gender g= Gender.MALE;
		 
		 System.out.println(g);

		Gender[] gr = Gender.FEMALE.values();
		
	    for(Gender gg:gr) {
	    	
	    	System.out.println(gg+ " "+gg.ordinal()); //ordinal index
	    }
	}

}
