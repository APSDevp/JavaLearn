package ExceptionHandling;

import java.util.Scanner;

class UnderAgeException extends Exception{
	
	UnderAgeException(String msg){
		super(msg);
	}
	
	
}

class OverAgeException extends Exception{
	
	OverAgeException(String msg){
		super(msg);
	}
	
}

class LApp{
	
	private int age;
	public void input(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Dear candiate kindly enter the age to check your availability: ");
		age = scan.nextInt();
	}
	
	public void verify() throws UnderAgeException,OverAgeException{
		if(age>=18 && age<=60) {
			System.out.println("you are eligible for the licence");
		}else if(age<18){
			//System.out.println("you are not eligible for the licence");
			throw new UnderAgeException("you are not eligible for the licence");
		} else if(age>65) {
			System.out.println("you are not eligible for the licence ");
			throw new OverAgeException("you are not eligible for the licence ");
		}
	}
	
}

class RTO{
	void initiate()
	{
		LApp la=new LApp();
		try
		{
			
			la.input();
			la.verify();
		}
		catch(UnderAgeException a)
		{
			System.out.println(a.getMessage());
			try
			{
				la.input();
			    la.verify();
				
			}
			catch(UnderAgeException b)
			{
				System.out.println(a.getMessage());
				System.out.println("Seems suspicious");
				System.exit(0);
			}
			catch(OverAgeException c)
			{
				System.out.println(a.getMessage());
				System.out.println("Seems suspicious");
				System.exit(0);
			}
		}
		catch(OverAgeException oae)
		{
			System.out.println(oae.getMessage());
			try
			{
				la.input();
			    la.verify();
				
			}
			catch(UnderAgeException b)
			{
				System.out.println("Seems suspicious");
				System.exit(0);
			}
			catch(OverAgeException c)
			{
				System.out.println("Seems suspicious");
				System.exit(0);
			}
		}
	}
}

public class CustomExpHand2LicenceRTO {
	
	public static void main(String[] args) {
		
		RTO r = new RTO();
		r.initiate();
		
	}

}
