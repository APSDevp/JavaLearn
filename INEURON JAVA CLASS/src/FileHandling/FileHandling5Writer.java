package FileHandling;

import java.io.*;

public class FileHandling5Writer {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("info.txt",true); //will create file 
		
		//this constructor re-use the same file and if not exit the create and re-use the same file
		//if true is there, it will append it each time
		
		fw.write(73); //ASCII value of character
		fw.write("Dhinesh\nThe Fet Quest\n");
		
		fw.write("Finance\n");
		
		char[] ch= {'a','b','c'};
		fw.write(ch);
		
		fw.flush();
		
		fw.close();	
	}

}
