package Innerclass;

public class regularInnerclass {
	
	//declaring class inside another class without the modifier is called regular inner class
	//default modifier is default
	
	class InnerOfRegular{
		
		//inside the inner class static boundary won't come so we can't use p.s.v.m in inner class
		
		public void m1() {
			System.out.println("Inside inner class instance Method");
		}
		
		
		/*
		public static void main(String[] args) {
			
		      System.out.println("Hello Regular Inner Class");
			} */
		
	}
	
	public void m2() {
		System.out.println("Method belongs to the outer class");
		
		//invoking the inner class from outer class method
		InnerOfRegular ir = new InnerOfRegular();
		ir.m1();
	}

	public static void main(String[] args) {
		
      System.out.println("Hello Regular outer Class");
      
      //normally JVM won't create object for outer class, it will just use the outer class name and
      //invoke the static(p.s.v.m) as it is static and run the program.
      //here in this case we can't access the inner class without creating the object for the
      //outer class
      
      //------------------------------------------------------------------
            regularInnerclass ri = new regularInnerclass();
      //can be re-written directly
      //------------------------------------------------------------------
      //by using the outer class object, creating the inner class object
      //below is the syntax
      
      //-------------------------------------------------------------------
      //regularInnerclass.InnerOfRegular in = ri.new InnerOfRegular();
      //-----------------------------------------------------------------
      //we can write the above code as direct reference as below
      
      //regularInnerclass.InnerOfRegular in = new regularInnerclass().new InnerOfRegular().m1();
      
      new regularInnerclass().new InnerOfRegular().m1(); //calling directly
      
      ri.m2();
      
      //in.m1();
	}

}
