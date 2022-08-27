
public class meth {
	
	int price;
	String brand;
	
	void disp() {
		System.out.println(price);
	}
	int add(int c, int b) {
		int e = c +b;
		System.out.println(e);
		
		return e;
	}

}

class exec {
	public static void main(String[] args) {
		System.out.println("gel");
		
		meth a = new meth();
		a.price = 100;
		a.disp();
		int g = a.add(6,6);
		System.out.println(g);
}
}