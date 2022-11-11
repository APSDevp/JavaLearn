package Enum;

enum Result{
    PASS,FAIL,NR;	
}

public class enum1 {

	public static void main(String[] args) {
		
		enum Gender{
			MALE,FEMALE, OTHERS;
		}
		Gender M = Gender.MALE;
		
		System.out.println(M);
		
		System.out.println("Ordinal "+M.ordinal()); //ordinal - index
			
           Result  r = Result.PASS;
           
           System.out.println(r);
	}

}
