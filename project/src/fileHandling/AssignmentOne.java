package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class AssignmentOne {

	/*public void RowCount(BufferedReader bfr) throws IOException
	{
		int count=0;
		while(bfr.readLine()!=null) count++;
		System.out.println("Total number of rows in text file is " + count);
	}*/
	
	
	public static void main(String[] args) throws IOException {
		
		File fi = new File("C:\\Users\\Nitish\\Desktop\\Workspace\\Learning Tracker\\Input.txt");
		FileReader fr = new FileReader(fi);
		//BufferedReader bfr = new BufferedReader(fr);
		AssignmentOne Obj = new AssignmentOne();
		//Obj.RowCount(bfr);
		BufferedReader bfr1 = new BufferedReader(fr);
		
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Please enter the number of line which you want to read" );
		int a =scan.nextInt();
		
		String s=null;
		for(int i=0 ; i<a;i++)
		{s=bfr1.readLine();}
		
		bfr1.close();
		System.out.println("Data: "+ s);
		
		
		
		
	}

}
