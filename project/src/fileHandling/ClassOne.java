package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ClassOne {

	public static void main(String[] args) throws IOException 
	{

		File fi = new File("C:\\Users\\Nitish\\Desktop\\Workspace\\Learning Tracker\\Input.txt");
		System.out.println("File is present:" + fi.exists());
		System.out.println("Length of file is:"+fi.length());
		FileReader fr = new FileReader(fi);
		
		int a;
		
		while((a=fr.read())!=-1)
		{
		System.out.print((char)a);	
		}
		
		fr.close();
		
		
		
	}

}
