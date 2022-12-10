package FileHandling;

import java.io.*;

public class FileHandling11DeleteFileDuplicate {

	public static void main(String[] args) throws IOException {
		
		PrintWriter pw = new PrintWriter("inputnodup.txt");
		
		BufferedReader br1 = new BufferedReader(new FileReader("input.txt"));
		
		BufferedReader br2 = null;
		
		String line1 = br1.readLine();
		
		while(line1!=null) {
			
			boolean isAvailable = false; 
			
			 br2 = new BufferedReader(new FileReader("delete.txt"));
			String line2 = br2.readLine();
			
			while(line2!=null) {
				
				if(line1.equals(line2)) {
					
					isAvailable = true;
					break;
					
				}
				
				line2 = br2.readLine();
				
			}
			
			if(!isAvailable ) {
				pw.println(line1);
				pw.flush();
			}
			
			line1 = br1.readLine();
			
		}	  
		  br1.close();
		  br2.close();
		  pw.close();

		System.out.println("Completed the Duplicate removal operation");

	}

}
