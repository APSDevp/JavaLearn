package Innerclass;

public class AnonymsInnerclass04 {

	public static void main(String[] args) {
			
	 new Thread(
				()-> { { //functional interface so we can use lambda
						
						for(int i =1;i<=5;i++) {
							System.out.println("Child thread");
						}
						
					}
				}
				).start();
	
		
		//System.out.println(r.getClass().getName());
		
		for(int i =1;i<=5;i++) {
			System.out.println("parent thread");
		}

	}

}
