package FileHandling;

import java.io.*;

public class FileHandling8PrintWrter {

	public static void main(String[] args) throws IOException {
		// TO write any type of data to file other than char data as filewriter and bufferwritter
		/* 
		 *Constructors:
		 *PrintWriter(String name)
		 *PrintWriter(File f)
		 *printWriter(Write w) */
		
		FileWriter fw = new FileWriter("cricket.txt");
		PrintWriter pw = new PrintWriter(fw);
		
		pw.println(10);
		pw.println("sachin");//using ln- will got to new line
		pw.println(true);
		pw.println('M');
		pw.println(53.5);
		
		pw.flush();
		pw.close();
		
		System.out.println("its done on print");
	}

}
