package FileHandling;
import java.io.*;

public class FileHandling1 {

	public static void main(String[] args) {
		
		System.out.println("hello java, Good to see you agin after a break");
		
		//****************file**************************
		File f = new File("abc.txt");
		
		System.out.println(f.exists());
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //to create the file
		
		System.out.println(f.exists());
		
		//*******************directory********************

		File dir = new File("tempdir");
		System.out.println(dir.exists());
		dir.mkdir();
		System.out.println(dir.exists());
		
		//**********************************************
		System.out.println(System.getProperty("user.dir"));

		
		
		
	}

}
