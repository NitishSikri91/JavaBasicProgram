package project;

import java.util.Scanner;

public class TablePrint {

	public static void main(String[] args) {
		System.out.println("Please enter the digit for the table");
		Scanner scan = new Scanner(System.in);
		int a= scan.nextInt();
		
		for (int i =1;i<=12;i++)
		{
			System.out.println(a + " times "+ i +" = "+ a*i);
		}
			
		
		
	}

}
