package abstractKword;

import java.util.Scanner;

abstract class Shapes{
	
	float area;
	
	abstract void input();
	abstract void compute();
	void disp() {
	System.out.println("The Area or Circumference of given figure is: "+ area);	
	}
}

class Rectangleoops extends Shapes{
	float len;
	float brd;
	
	void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("PLease enter the length of rectangle: ");
		len=scan.nextFloat();
		System.out.println("Please enter the Breadth of rectangle: ");
		brd=scan.nextFloat();
	}
	
	void compute(){
		area = len*brd;
	}
}

class Squareoops extends Shapes{
	float side;

	
	void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("PLease enter the side of square: ");
		side=scan.nextFloat();
	}
	
	void compute(){
		area = side*side;
	}
}

class Circleoops extends Shapes{
	float radius;
	final float pi = 3.14f;
	
	void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("PLease enter the radius of circle: ");
		radius=scan.nextFloat();

	}
	
	void compute(){
		area = pi*radius*radius;
	}
	
}

class executionPoly{
	void Permit(Shapes s) {
		s.input();
		s.compute();
		s.disp();	
		}
}
public class mensurationOopsProject {
	
	public static void main(String[] args) {
		Rectangleoops rec = new Rectangleoops();
		Squareoops sqr = new Squareoops();
		Circleoops cir = new Circleoops();
		
		executionPoly exe = new executionPoly();
		exe.Permit(rec);
		exe.Permit(sqr);
		exe.Permit(cir);
		
		
	}

}
