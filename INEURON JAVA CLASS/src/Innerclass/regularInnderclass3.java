package Innerclass;

class A{
	class B{
		class C{
			public void m1() {
				
				System.out.println("m1() of inner class");		
			}
		}
	}
}

public class regularInnderclass3 {

	public static void main(String[] args) {
		
        A a = new A();
        A.B b = a.new B();
        A.B.C c= b.new C();
        
        c.m1();
        
        //another way to write the above code
        new A().new B().new C().m1();
	}

}
