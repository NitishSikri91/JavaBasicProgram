package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class AssignmentFour {

	public static void main(String[] args) throws IOException {
		File fi1 = new File("C:\\Users\\Nitish\\Desktop\\Workspace\\Learning Tracker\\Input.txt");
		File fi2 = new File("C:\\Users\\Nitish\\Desktop\\Workspace\\Learning Tracker\\Output.txt");
		
		FileReader fr = new FileReader(fi1);
		FileWriter fw = new FileWriter(fi2);
		
		BufferedReader bfr = new BufferedReader(fr);
		BufferedWriter bfw = new BufferedWriter(fw);
		
		String str =null;
		
		while ((str=bfr.readLine())!=null)
		{
			bfw.write(str);
			bfw.newLine();
		}
		bfr.close();
		bfw.flush();
		bfw.close();
		
		
	}
	
	
	
}
