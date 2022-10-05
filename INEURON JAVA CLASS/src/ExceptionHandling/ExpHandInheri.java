package ExceptionHandling;

class Demo10{
	
	void disp()  {
		System.out.println("Parent class overiiden method");
	}
}

//if parent is not  throwing any exception then child can also ignore

//we can't use checked exception in child if parent don't have one for overiding method

class Demo11 extends Demo10{
	
	void disp() { //throws InterruptedException  -- we can't use here because parent don't have checked exception
		System.out.println("Parent class overidden method in child");
	}
	
}

class Demo12{
	
	void disp() throws ArithmeticException {
		System.out.println("Parent class overiiden method");
	}
}

//if parent has unchecked exception then child has no compulsion to have the same but if it wish it can
//child can't have the checked exception without parent

class Demo13 extends Demo12{
	
	void disp()  {
		System.out.println("Parent class overiiden method");
	}
}


public class ExpHandInheri {

	public static void main(String[] args) {

	Demo11 d = new Demo11();
    d.disp();

	}

}
