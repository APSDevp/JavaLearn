package inueron;

class matheoperation {
	
	public int add(int a,int b) {
		
		int result = a +  b;
		System.out.println("inside the add method");
		return result;
	}
	
	public int add(int a,int b, int c, String d)  {  //same method name but different parameter
		
		int result = a +  b + c;
		System.out.println("inside the addnew method");
		return result;
	}
	
}

public class methodoverloading {
	
	public static void main(String args[]) {
		int num1 = 5;
		int num2 = 6;
		int num3 = 7;
		matheoperation calc = new matheoperation(); // calc is reference variable and new matheoper*8 is object
		int result = calc.add(num1,num2);
		int result1 = calc.add(num1,num2, num3,"hel");
		System.out.println(result);
		System.out.println(result1);
			
	}

}
