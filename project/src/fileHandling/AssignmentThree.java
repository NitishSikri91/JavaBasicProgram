package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AssignmentThree {

	public void RowCount(BufferedReader bfr ) throws IOException
	{
		int count=0;
		while(bfr.readLine()!=null) count++;
		System.out.println("Total number of rows in text file is " + count);
		
	}
		
	 void ReadLines(int i , int j,BufferedReader bfr ) throws IOException
	{String str;
		for (int k=1;k<i;k++)
		{			bfr.readLine();}
		
	while(i<=j)
	{
		str = bfr.readLine();
		System.out.println(str);
		i++;
	}
		
	}
	
	public static void main(String[] args) throws IOException {

		AssignmentThree Obj = new AssignmentThree();
		File fi = new File("C:\\Users\\Nitish\\Desktop\\Workspace\\Learning Tracker\\Practice1.txt");
		FileReader fr = new FileReader(fi);
		BufferedReader bfr = new BufferedReader(fr);
		Obj.RowCount(bfr);
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter start line for read");
		int a =scan.nextInt();
		System.out.println("Please enter last line for read");
		int b =scan.nextInt();
		Obj.ReadLines(a, b,bfr);
		
		
		
		
	}

}
