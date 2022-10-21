package varargs;

//varargs to handle to function parameters dynamically like method overloading
class calc{
	
	//public int add(int nums[])
	public int add(int ... nums) //varargs syntax {...} 3 dots, here nums is still an array
	{
	int sum =0;
	
	for(int i: nums) {
		sum = sum + i;
	}
	
	return sum;
	}
	
	public int add(int x, int y, int z) {  //method overloading
		
		return x+y+z;
	}
}

public class varargs1 {

	public static void main(String[] args) {

       calc c = new calc();
       //int y = c.add(5, 6);
       //System.out.println(y);
       
       //int d = c.add(5, 6,5);
       //System.out.println(d);
       
       //int nums[] = {4,6,8,10};
       //int varresult = c.add(nums);
       
       //System.out.println(varresult);
       
       int result = c.add(6,4,8,10);
       System.out.println(result);
       
       }

}
