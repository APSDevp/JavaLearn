package StreamAPI;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAPI1 {

	public static void main(String[] args) {
	  
		List<Integer> nums = Arrays.asList(6,5,2,8,1,7);
		
		System.out.println(nums);
		/*
		//we can iterate the value in different ways
		int sum = 0;
		for(int n : nums) {
			if(n%2 ==1) {
				System.out.println(n);
				n = n * 2;
				
				sum = sum + n;
				
			}
		}
		System.out.println(sum);
          */
		
		//Streams
		
		//predicate -> to create filter 
		/*
		Predicate<Integer> predicate = new Predicate<Integer>() {
		 @Override
		 
		 public boolean test(Integer n) {
			 if(n % 2 == 1)
				 return true;
			 else
				 return false;
		 }
		 
		 //**********************code- rewritting***********
		 //public boolean test(Integer n) { return n%2==1; } // will also work
		 //using the lambda expression
		   
		  
		 //Predicate<Integer> predicate = n -> n%2 ==1;
		  
		  
		  
		};*/
		
		Function<Integer, Integer> func =(Integer n) ->  n*2;
		
		Stream<Integer> stream = nums.stream();
		Stream<Integer> stream1 = nums.stream();
		Stream<Integer> stream3 = nums.stream();
		Stream<Integer> stream5 = nums.stream();
		Stream<Integer> stream8 = nums.stream();
		
		//System.out.println(stream);
		
		stream.forEach(n -> System.out.println(n)); //forEach -> internal iteration
		//once the stream is operated we can't re-use(print can't use used once again)
		//stream.forEach(n -> System.out.println(n));
		
		Stream<Integer> stream2 = stream1.filter(n -> n%2 ==1); //check the above commented one to see how it internally works
		System.out.println("Printing the filtered output");
		stream2.forEach(n -> System.out.println(n));
		
		Stream<Integer> stream4 = stream3.map(func);
		
		//Stream<Integer> stream4 = stream3.map(n -> n*2);
		
		System.out.println("************Doubling the value based on above func********");
		stream4.forEach(n -> System.out.println(n));
		
		BinaryOperator<Integer> bi = new BinaryOperator<Integer>(){
			
			@Override
			
			public Integer apply(Integer s, Integer e) {
				//System.out.println(s + " : "+e);
				return s+e;
			}
			
		};
		
		int result = stream5.reduce(0,bi);
		System.out.println("**********Addition**************");
		System.out.println(result);
		
		System.out.println("*******All the Methods into single operations************");
		
		
		int resultWholestic = nums.stream()
				.filter(n -> n%2 ==1)
				.map(n-> n*2)
				.reduce(0, (s,e)-> s+e);
		
		System.out.println("resultWholestic "+ resultWholestic);
	}

}
