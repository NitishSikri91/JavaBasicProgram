package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//This program will always override the older values in the output file

public class Class103 {

	public static void main(String[] args) throws IOException {

		File fi = new File("C:\\Users\\Nitish\\Desktop\\Workspace\\Learning Tracker\\Created01.txt");
		FileWriter fr = new FileWriter(fi);
		fr.write("This is the first line");
		fr.write("\n");
		fr.write("This should be the second line");
		fr.close();
		
		
	}

}
