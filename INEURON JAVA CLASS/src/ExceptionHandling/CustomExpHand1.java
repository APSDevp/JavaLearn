package ExceptionHandling;

import java.util.Scanner;

//custom exception creation

class InvalidUserException extends Exception{
	
	InvalidUserException(String msg){
		super(msg); //parent of exception is throwable, throwable will have super($parm) to accept it
	}
}

class ATM{
	private int accountNum =111;
	private int password = 222;
	private int accN;
	private int pw;
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the account Number: ");
		accN= scan.nextInt();
		
		System.out.println("Enter the password: ");
		pw= scan.nextInt();
	}
	
	public void verify() throws InvalidUserException{  //we can Also use "throws Exception"
		if(accountNum == accN && password == pw) {
			System.out.println("Collect your cash");
		}else { //creating the user exception
			/*
			InvalidUserException iue = new InvalidUserException();		
			System.out.println("Invalid Credentials");
			throw iue; */
			
			throw new InvalidUserException("Invalid Credentials!");
		}
	}
}

class Bank{
	public void initiate() {
		ATM a = new ATM();
		try {
		a.input();
		a.verify();
		}
		catch(InvalidUserException e) {
			
			try {
				System.out.println(e.getMessage()); //getMessage is the inbuilt method where the exception variable get stored in throwable classs
			a.input();
			a.verify();
			} catch(InvalidUserException f){
				try {
					System.out.println(f.getMessage());
					a.input();
					a.verify();
					}catch(InvalidUserException g) {
						 System.out.println("Attempts are over");
						 System.exit(0);
					}
			}
			
		}
	}
}
public class CustomExpHand1 {

	public static void main(String[] args) {
      
		Bank b = new Bank();
		b.initiate();

	}

}
