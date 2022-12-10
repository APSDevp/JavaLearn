package FileHandling;

import java.io.*;

public class FileHandling9CopyFiles {

	public static void main(String[] args) throws IOException {
		
		PrintWriter pw = new PrintWriter("abcCricket.txt");
		
		BufferedReader br1 = new BufferedReader(new FileReader("abc.txt"));
		
		//br = new new BufferedReader(new FileReader("abc.txt"));
		
		  //copy content from abc to abcCricket
		  String line1 =  br1.readLine();
		  
		  while(line1!=null) {
			  pw.println(line1);
			  
			  line1= br1.readLine();
		  }
		
		BufferedReader br2 = new BufferedReader(new FileReader("cricket.txt"));
		
		//br = new new BufferedReader(new FileReader("cricket.txt"));
		
		  String line2 =  br2.readLine();
		  
		  while(line2!=null) {
			  pw.println(line2);
			  
			  line2= br2.readLine();
		  }
		
		
		  pw.flush();
		//br.close(); //we can aslo use like this by having the same variable name
		  
		  br1.close();
		  br2.close();
		  pw.close();
		  
		  System.out.println("Copy of the files completed");
	}

}
