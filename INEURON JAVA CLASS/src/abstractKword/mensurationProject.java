package abstractKword;

import java.util.Scanner;

class Rectangle{
	
	float len;
	float brd;
	float area;
	
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
	
	void display() {
		System.out.println("The area of the rectangle is: "+area);
	}
}

class Square{
	
	
	float side;

	float area;
	
	void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("PLease enter the side of square: ");
		side=scan.nextFloat();
	}
	
	void compute(){
		area = side*side;
	}
	
	void display() {
		System.out.println("The area of the square is: "+area);
	}
	
}

class Circles{
	
	float radius;
	float area;
	
	void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("PLease enter the radius of circle: ");
		radius=scan.nextFloat();

	}
	
	void compute(){
		area = 3.14f*radius*radius;
	}
	
	void display() {
		System.out.println("The circumference of the circle is: "+area);
	}
	
}

public class mensurationProject {
	
	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		Square sqr = new Square();
		Circles cir = new Circles();
		
		rec.input();
		rec.compute();
		rec.display();
		
		sqr.input();
		sqr.compute();
		sqr.display();
		
		cir.input();
		cir.compute();
		cir.display();
	}

	

}
