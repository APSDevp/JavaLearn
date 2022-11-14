package Annotation;

import java.lang.annotation.*;

//@ specifies compiler that annotation type is being created

@Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD} )  //we have to say where to use the annotation - class, fields, methods etc.
//target is an annotation it is used for another annotation is called meta annotation
//type -> class type
@Retention(RetentionPolicy.RUNTIME)
@interface CricketPlayer{ //custom annotation
	
	String gameName() default "Cricket"; //this is property- Variables
	int runs() default 20000;
}



@CricketPlayer //using the created interface
//@CricketPlayer(gameName ="Cricket", runs=2000) like this also we can pass values
class Virat{
	private String name;
	private int age;
	
	public void disp() {
		System.out.println("Virat is Indian");
	}
}

public class Annotation2 {

	public static void main(String[] args) {
		
		Virat v = new Virat();
		v.disp();
		//reflection class to use the annotation created
		Class c=v.getClass();
		Annotation a = c.getAnnotation(CricketPlayer.class);
		CricketPlayer cp=(CricketPlayer)a;
		System.out.println(cp.gameName());
		System.out.println(cp.runs());
	}

}
