package inueron;

class plane1 {
	
	public void fly() {
		System.out.println("plane is flying");
	}
	
	public void takeOff() {
		System.out.println("plane is taking off");
	}
}

class cargoPlane1 extends plane1 {
	
	public void fly() {
		System.out.println("cargoplane flying which flies at lower height");
	}
	
	public void takeoff() {
		System.out.println("cargo plane requires longer run way to takeoff");
	}
}

class PassengerPlane extends plane1 {
	
	public void fly() {
		System.out.println("passenger plane flies at lower height");
	}
	
	public void takeoff() {
		System.out.println("passenger plane requires medium runway to takeoff");
	}
	
}

class fighterPlane extends plane1 {
	
	public void fly() {
		System.out.println("fighter plane flies at higher height");
	}
	
	public void takeoff() {
		System.out.println("fighter plane requires short runway to takeoff");
	}
	
}

class Airport {
	public void permit(plane1 p) {    //1 :M  Plane1 will take cargoplane as reference because both has relation, onlt those have relation will be accepted
		//takeoff and fly method is executed for different functions by using the single "Airport" function -> 1:M
		
		//loose-coupling
		//using father relation to use child relation is called polumorphism
		p.takeOff();
		p.fly();
		
	}
}

public class polyLearn1 {
	public static void main(String[] args) {
			
		cargoPlane1 cp = new cargoPlane1();
		fighterPlane fp = new fighterPlane();
		PassengerPlane pp = new PassengerPlane();
		
		//cp.takeoff(); //1:1 relation 
		//cp.fly();    //1:1 relation
		
		//fp.takeoff();
		//fp.fly();
		
		//polymorphism
		System.out.println("polymorphism starts");
		//plane1 p;
		
		/* p = cp;
		p.takeOff();
		p.fly();
		
		p= fp;
		p.takeOff();
		p.fly();
		
		p= pp;
		p.takeOff();
		p.fly(); */
		
		Airport a = new Airport();
		a.permit(cp);
		a.permit(fp);
		a.permit(pp);
	}

}

