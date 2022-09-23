package LambdaFunctionalinterface;

@FunctionalInterface
interface CLS {
	int getLength(String s);
}

//Anonyms Inner class
public class Annoinner2 {

	public static void main(String[] args) {
		
		CLS c = new CLS() {
			
			public int getLength(String s) {
				
				int result = s.length();
				return result;
			}
		};

        System.out.println(c.getLength("dhinesh"));
	}

}
