package LambdaFunctionalinterface;


//if interface has single abstract method we can use lambda expression else we can't use

//if interface has more than one method then it can't implement the lambda expression it will create error



@FunctionalInterface  //if we give FunctionalINterface this shows users that this is functional interface and should have single method
interface Demop {
	void disp();
}





class Alpha implements Demop{
	public void disp() {
		System.out.println("I have given body");
	}
}



public class lamdaexp1 {
	
	public static void main(String[] args) {
		Alpha al = new Alpha();
		al.disp();
	}

}
