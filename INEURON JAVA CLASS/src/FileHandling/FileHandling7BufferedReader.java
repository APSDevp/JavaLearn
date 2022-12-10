package FileHandling;

import java.io.*;

public class FileHandling7BufferedReader  {

	public static void main(String[] args) throws IOException {
		
		//To read by line by line rather than words by words
		//.read()
		//.read(ch)
		//.readLine()
		
		BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
		
		String line = br.readLine();
		
		while(line!=null) {
			System.out.println(line);
			line = br.readLine();
		}
		

	}

}
