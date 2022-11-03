package GenercCollection;

import java.util.*;

class student implements Comparable<student>{  //comparable to compare the values 
	
	int age;
	String Name;
	String tech;
	
	public student(int age, String Name, String tech) {

		this.age = age;
		this.Name = Name;
		this.tech = tech;
	}
	
	@Override
	public String toString() { //to get output as string rather than hashcode
		return "Student [age=" + age + ", name ="+ Name + ", tech="+ tech +"]";
		
		//return"student";
	}
	
	public int compareTo(student that) { //this is nagesg, that is aswini - nagesh is comparing with aswini
		return this.age - that.age; //ascending order
		
		//return that.age - this.age; //for descending order 
		
		//return this.name.compareTo(that.name); //string has it's own compareTo method to sort
		
		//Assignment -> sort based on the number of length in tech.
		//Assignment -> sort based on the second letter of the string
	}
	
	
	
}

public class Comparator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//student s1 = new student(21,"Dhi","DevOps");
		
		ArrayList<student> nums = new ArrayList<>(); //creating array list of students
		
		nums.add(new student(21,"Dhi","DevOps"));
		nums.add(new student(17,"Fet","BloackChain"));
		nums.add(new student(18,"Quest","Finance"));

		
		System.out.println(nums);
		Collections.sort(nums);
		//21 17 18 (if positive it will swap)this-that
		//17 21 18
		//17 18 21
		
		//17 18 21
		
		System.out.println("--------Printing Sorted-------------");
	    System.out.println(nums);

	}

}
