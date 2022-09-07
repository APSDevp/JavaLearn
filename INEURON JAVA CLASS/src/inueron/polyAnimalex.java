package inueron;

class Animal {
	
	public void eat() {
		System.out.println("Animal must eat to survive on its own");
	}
	
	public void sleep() {
		System.out.println("It is difficult to be animal because sleeping is uncertain");
	}
}

class Tiger extends Animal {
	
	public void eat() {
		System.out.println("Tiger eats Flesh");
	}
	
	public void sleep() {
		System.out.println("Tiger sleep better than other animal");
	}
	
}

class Monkey extends Animal {
	
	public void eat() {
		System.out.println("Monkey eats Fruits and leaves");
	}
	
	public void sleep() {
		System.out.println("Monkey sleeps on the tree");
	}
	
}

class Deer extends Animal {
	
	public void eat() {
		System.out.println("Deer eats grass");
	}
	
	public void sleep() {
		System.out.println("Deer sleeps are very dangerous");
	}
	
}

class Forest {
	
	public void living(Animal a1) {
	a1.eat();
	a1.sleep();
	}
}


public class polyAnimalex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tiger tg = new Tiger();
		Monkey mk = new Monkey();
		Deer dr = new Deer();
		
		Forest ft = new Forest();
		ft.living(tg);
		ft.living(mk);
		ft.living(dr);

	}

}
