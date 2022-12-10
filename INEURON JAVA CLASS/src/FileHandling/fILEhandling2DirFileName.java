package FileHandling;

import java.io.*;

public class fILEhandling2DirFileName {
	
	public static void main(String[] args) throws IOException {
		
		//dir should be already present
		//to create a dir and create a file inside it
		File fr = new File("tempdir","temp1.txt");
		fr.createNewFile();

	}

}
