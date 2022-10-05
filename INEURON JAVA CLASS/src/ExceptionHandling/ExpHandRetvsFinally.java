package ExceptionHandling;


class dell{
	int disp() {
		try {
			return 10;
		}
		finally {
			System.out.println("Disp finally line");
		}
	}
}
public class ExpHandRetvsFinally {

	public static void main(String[] args) {
		dell d = new dell();
		System.out.println(d.disp());

	}

}
