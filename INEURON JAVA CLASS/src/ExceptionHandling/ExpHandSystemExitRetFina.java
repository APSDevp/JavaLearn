package ExceptionHandling;



class Betal{
	void disp() {
		try {
			System.out.println("Disp Method");		
			System.exit(0); //program will stop and finally won't get execute
		}
		finally {
			System.out.println("AFter the System Exit");
		}
	}
}

public class ExpHandSystemExitRetFina {
	
	public static void main(String[] args) {
		
		Betal b = new Betal();
		b.disp();
		
	}

}
