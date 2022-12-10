package FileHandling;

import java.io.*;

public class FileHandling3Fileobj {

	public static void main(String[] args) throws IOException {
		
		File fd = new File("temp2dir");
		fd.mkdir();
		
		// *******************
		File dt = new File(fd,"demo.txt");
		System.out.println("Directory Created with file");
		
		dt.createNewFile();
		
		// *******************
		File dg = new File("D:\\javafilecreation","demo.txt");
		dg.createNewFile();
		
		//*********** is file************ boolean
		
		System.out.println(dt.isFile());
		
		// ***********IS DIRECTORY ********* boolean
		
		System.out.println(fd.isDirectory());
		
		//********* Length() - character in file ***** long
		
		System.out.println(fd.length());
	    
		//********* delete() - ******* boolean
		
		// *****list **************String[]
		
		System.out.println(dt.list());

	}

}
