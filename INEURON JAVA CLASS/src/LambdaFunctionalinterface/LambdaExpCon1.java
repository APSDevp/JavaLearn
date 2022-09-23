package LambdaFunctionalinterface;

interface Computer {
	void show(int num, int el);
}

//having return type
interface returntyp {
	int add(int num1, int num2);
}
/*
class Laptop implements Computer {
	
	public void show() {
		System.out.println("This is laptop");
	}
}*/

public class LambdaExpCon1 {

	public static void main(String[] args) {
		
		//by saying () -> the jvm will understand that we going to implement the show method of interface class
		//interface should have only one method
		
		
		//no need to mention the datatype as it automatically understand
		//fr 1 variable we can use directly Computer com = num ->
		Computer com = (num,el) -> System.out.println("This is laptop in inner class " + num+" "+el);
		
		//above Lambda exp does what below coide performs
		/* 
		 * Computer com = new Laptop()
		 * com.show();
		 * */	

		
		com.show(5,7);
		 
		//In single line
		//returntyp rep = (num1,num2) -> num1+num2;
		
		
		//in multiple lines
		returntyp rep = (num1,num2) -> {
			int result = num1+num2;
			return result;
			};
		
		System.out.println(rep.add(5, 6));
	

	}

}
