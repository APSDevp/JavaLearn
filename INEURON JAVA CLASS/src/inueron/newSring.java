package inueron;

public class newSring {
	
	public static void main(String args[]) {
		
		String name = "The FET Quest";
		String newName = "The FET Quest";
		
		String topic = new String("Java topic");
		String content = new String("Java topic");
		
		System.out.println(name == newName);
		System.out.println(topic == content);
		
		System.out.println(name.equals(newName)); // Returns True
		System.out.println(topic.equals(content)); //
		
		String content1 = new String("Java topic check");
		String content2 = "Java topic check";
		String content3 = new String("Java topic check");
		String content4 = "Java topic check";
		
		System.out.println(content1 == content2);
		System.out.println(content1 == content3);
		System.out.println(content2 == content4);
		
		StringBuilder str = new StringBuilder();
		str.append("GFG");
		System.out.println(str);
		str.append("GFGdf");
		System.out.println(str);
		System.out.println( str.charAt(1));
		content2.charAt(1);
		System.out.println(str.reverse());
		
		String mal = "JAVA";
		String cal;
		System.out.println(mal.length());
		
		
		for(int i = mal.length();i>1;i--) {
			
			System.out.println(mal.charAt(i-1));
			
		} 
	}

}
