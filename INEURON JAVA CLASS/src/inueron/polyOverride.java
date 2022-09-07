package inueron;

class Plane2
{
	
	 void fly() {
		System.out.println("Plane is flying");
	}
	}
// while inheriting the visibility should increase not decrease -> default-protected-private
// we can't decrease the visibility
class CargoPlane2 extends Plane2 {
	protected void fly () {  // 
		System.out.println("Cargo plane fly at lower height");
	}
}

public class polyOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
