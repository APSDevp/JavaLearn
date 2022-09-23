package interFaceConcepts;

interface calcu {
	void add();
}

class MyClac{
	void sub() {
		int a = 10;
		int b = 5;
		
		int c = a -b;
		System.out.println(c);
	}
}

class MyC extends MyClac  implements calcu{
	
	public void add() {
		int d = 52;
		int e = 60;
		int f = d + e;
		System.out.println(f);
	}
	
	public void sub() {
		
		int a = 15;
		int b = 5;
		
		int c = a -b;
		System.out.println(c);
		
	}
}

public class ExtendsAndImplementsInSame {
	
	public static void main(String[] args) {
		
		MyC al = new MyC();
		al.add();
		al.sub();
		
		//calcu cal = new MyC();
		//cal.add();
		
	}
	

}
