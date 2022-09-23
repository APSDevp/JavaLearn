package interFaceConcepts;

interface CalcMul1{
	void add(int a, int b);
}

interface CalcMul2{
	int sub(int a, int b);
}

class MycalcMul implements CalcMul1, CalcMul2{
	
	public void add(int a, int b) {
		int c = a + b;
		System.out.println("The addition value is: "+c);
	}
	
	public int sub(int a , int b) {
		int c = a - b;
		return c;
	}
	
	 /* public int mul() {
		int d = 5 * 6;
		System.out.println(d);
		return d; 
	} */
	
}
public class MultiInterfaceCalc {

	public static void main(String[] args) {
		
		MycalcMul arth = new MycalcMul();
		arth.add(5, 6);
		System.out.println(arth.sub(8, 4));
		//arth.mul();
		//System.out.println(arth.mul());


	}

}
