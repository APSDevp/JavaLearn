
public class hello {
	
	void doSomething() {
		System.out.println("something");
	}
	
	public static void main(String args[]) {
		System.out.println("hello");
		hello A = new hello();
		A.doSomething();
		byte e = 6;
		byte f = e++;
		//byte g = ++f;
		System.out.println("the value of e is "+ e);
		System.out.println("the value of f is "+ f);
		//System.out.println("value of g is "+ g);
		int age = 18;
		String result = age>=18 ? "allowed" : "not allowed";
		System.out.println(result);
		int num = 3;
		switch(num)
		{
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		default:
			System.out.println("done");
		}
		
		
		
	}

}
