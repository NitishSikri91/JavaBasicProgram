package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Class104 {

	public static void main(String[] args) throws IOException {

		File fi = new File("C:\\Users\\Nitish\\Desktop\\Workspace\\Learning Tracker\\Created01.txt");
		FileWriter fw = new FileWriter(fi,true);
		BufferedWriter bfw = new BufferedWriter(fw);
		
		bfw.write("To test the append of lines ");
		bfw.newLine();
		bfw.write("This is the first line");
		bfw.newLine();
		bfw.write("This is the second line");
		
		
		bfw.flush();
		bfw.close();
		
		
		
	}

}
