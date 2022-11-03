package GenercCollection;

import java.util.*;

class Demo<T extends Number>{ //here it will accept number type or it's child class(accepts Number,integer,Double)
	//Number is parent class, Integer and Double are its's child classs
	
}

class Sampler<T extends Runnable>{
	
}

/*
class SampleS<T implements X>{ //invalid
	
} */



public class UserdefinedBounded {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo<Integer> d1 = new Demo<Integer>();
		Demo<Double> d2 = new Demo<Double>();
		Demo<Number> d3 = new Demo<Number>();
		
		Sampler<Runnable> r1 = new Sampler<Runnable>();
		Sampler<Thread> r2 = new Sampler<Thread>();
		
		

	}

}
