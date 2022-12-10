package FileHandling;

import java.io.*;

public class FileHandling6Reader {

	public static void main(String[] args) throws IOException {
		
		FileReader fg = new FileReader("info.txt");
		
		int i = fg.read(); //read 1 character
		
		//File reader reads char by char so performance is slow, so we can use use buffer reader
		
		//System.out.println(i); //read only 1 character
		
		/*
		while(i!=-1) {
			//System.out.println((char)i); //converting the int to char
			//i = fg.read(); //reading again
		}*/
		
		//***************Approach **********
		
		File g = new File("info.txt");
		FileReader hj = new FileReader(g);
		
	    char [] c = new char[(int)g.length()]; //file size will be automatically changeable
	    
	    //System.out.println(c+"the c value is");
	    
		hj.read(c); //read ji and stores it to c array
		
		for(char chr : c) {
			System.out.println(chr);
		}
		fg.close();

	}

}
