package FileHandling;

import java.io.*;

public class FileHandling4Methods  {

	public static void main(String[] args) throws IOException {
		
		File f = new File("D:\\gitdiffLearning");
		
		String[] data = f.list();
		
		int count =0;
		
		for(String fileInfo: data) {
			
			File fy = new File(f,fileInfo); //filInfo is string so we can check it for file or sir coz we need method for it
			
			if(fy.isDirectory()) {
				
				System.out.println(fileInfo);
				
				count ++;
			}

		}
		
		System.out.println("No of files present is "+ count);
	}

}
