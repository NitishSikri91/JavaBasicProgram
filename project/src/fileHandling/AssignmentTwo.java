package fileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class AssignmentTwo {

	public void AppendFile(int a) throws IOException
	{
		File fi = new File("C:\\Users\\Nitish\\Desktop\\Workspace\\Learning Tracker\\Practice1.txt");
		FileWriter fw = new FileWriter(fi,true);
		BufferedWriter bfw = new BufferedWriter(fw);
		Scanner scan1=new Scanner(System.in);
		String str=null;
		for(int i =1;i<=a;i++)
		{
			System.out.println("Please enter line "+i);
			 str= scan1.nextLine();
			bfw.write(str);
			bfw.newLine();
		}
		bfw.flush();
		bfw.close();	}
	

	public static void main(String[] args) throws IOException {

		System.out.println("Please enter the number of line you want to enter in the file");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		AssignmentTwo Obj = new AssignmentTwo();
		Obj.AppendFile(a);
		
		
	}

}
