package FileHandling;

import java.io.*;

public class FileHandling7BufferedWriter {

	public static void main(String[] args) throws IOException {
	 
		/*
		 * Constructors
		 * BufferedWriter(Writer w) //it needs writer  object - new FileWriter
		 * BufferedWriter(Writer w, int buffersize)*/
		
		//it can't communicate with file directly it requires FileWriter
		
		//newLine() -> method is there to get into new line which not available in FileWriter
		
		//write(ch), write(char[]), write(string)
		
		//bufferClose is enough to close FileWriter
		
		BufferedWriter br = new BufferedWriter(new FileWriter("abc.txt"));
		
		br.write(78);
		br.write("The FET Quest");
		br.newLine();
		br.write("Java Learning");
		br.newLine();
		
		char ch[]= {'a','l','l', ' ','i','s',' ','w','e','l','l'};
		
		br.write(ch);
		
		br.flush();
		
		br.close();
		
		System.out.println("It is Done");

	}

}
