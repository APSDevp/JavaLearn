package inueron;
import java.util.Scanner;

class Farmer {
	private float pa;  // varaible as need of farmers
	private float td;  // varaible as need of farmers
	private float si;
	static private float ri; // bank will decide so keeping it as static
	
	static {
		ri =2.5f; //effiecent way of writting
	}
	
	public void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Dear, Kindly enter the loan amount needed: ");
		pa = scan.nextFloat();
		System.out.println("Dear,Kindly enter the time needed: ");
		td = scan.nextFloat();
		//ri = 2.5f;	
		
	}
	
	public void compute() {
		si = (pa*td*ri)/100;
	}
	
	public void disp() {
		System.out.println("SI is " + si);
	}
}

public class staticFarmerApp {

	public static void main(String[] args) {
		Farmer f1= new Farmer();  //memory will be created
		Farmer f2= new Farmer();  //again memory will be created 
		
		f1.acceptInput();
		f1.compute();
		f1.disp();
		
		f2.acceptInput();
		f2.compute();
		f2.disp();
	
	

	}

}
