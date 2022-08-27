package inueron;

class plane {
	
	public void fly() {
		System.out.println("plane is flying");
	}
	
	public void takeOff() {
		System.out.println("plane is taking off");
	}
}

class cargoPlane extends plane {
	
	public void fly() {
		System.out.println("overriding the plane flying which flies at lower height");
	}
	
	public void goods() {
		System.out.println("cargo plane carries Goods");
	}
}

class passenger extends plane {
	
	public void fly() {
		System.out.println("passenger plane flying at higher height");
	}
	
	public void psgr() {
		System.out.println("passenger plane carries people");
	}
	
}

public class inheritvariousMethods {
	public static void main(String[] args) {
		
		//cargoPlane cp = new cargoPlane();
		plane cp = new cargoPlane();  // reference name can be parent class
		cp.fly();
		cp.takeOff();
		//by downcasting we can use the parent to use child behaviour, so parent behave as child
		((cargoPlane) cp).goods();
		 // by referencing the parent class we can't use the child class directly
		
		passenger pp = new passenger();
		pp.fly();
		pp.takeOff();
		pp.psgr();

		
		
	}

}
