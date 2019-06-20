package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ClasTwoFH {

	public static void main(String[] args) throws IOException {
		
		File fi = new File("C:\\Users\\Nitish\\Desktop\\Workspace\\Learning Tracker\\Input.txt");
		FileReader fr = new FileReader(fi);
		BufferedReader fbr = new BufferedReader(fr);
		
		String s;
		
		while((s=fbr.readLine())!=null)
	{
		System.out.println(s);
		
	}
	fbr.close();
	fr.close();
		
	}
	
	
	
}
