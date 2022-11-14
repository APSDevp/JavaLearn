package Annotation;

//its functional interface please don't add more than one method

@FunctionalInterface //by adding it - compiler will raise error if there is more than 1 method
interface Addition{
	void add();
	//int sub();
}

class Demo{
	void getInfo() {
		System.out.println("Infor in for parent");
	}
}

class Demo2 extends Demo{
	@Override  //here if the below method name is not given properly as parent type, it will create error
	void getInfo() {
		System.out.println("Infor in for child parent overidded");
	}
}


public class Annotation1 {

	public static void main(String[] args) {
		
		Demo2 D= new Demo2();
		D.getInfo();

	}

}
