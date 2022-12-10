package FileHandling;

import java.io.*;

public class FileHandling10CopyFiles {

	public static void main(String[] args) throws IOException {
		
		PrintWriter pw = new PrintWriter("abcCricketAlternative.txt");
		
		BufferedReader br1 = new BufferedReader(new FileReader("abc.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("cricket.txt"));
		
		String line1 = br1.readLine();
		String line2 = br2.readLine();
		
		while(line1!=null || line2!=null ) { //even if uneven line, it will work
			
			if(line1 != null) {
			pw.println(line1);
			line1 =br1.readLine();
			}
			if(line2 != null) {
			pw.println(line2);
			line2=br2.readLine();
			}
		}
		
		  pw.flush();	  
		  br1.close();
		  br2.close();
		  pw.close();
		  
		  System.out.println("Copy of the files completed");
	}

}
