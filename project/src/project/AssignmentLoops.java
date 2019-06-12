package project;

import java.util.Scanner;

public class AssignmentLoops {

	
	 static boolean IsPrime(int a)
	{
		for (int i=2;i<a/2;i++)
		 {
			 if (a%i==0) {
			return false; }
		 }
		return true;

	}
	public static void main(String[] args) {
		
		System.out.println("Please enter a number");
		 Scanner scan = new Scanner(System.in);
		 int a= scan.nextInt();
		 
		 if(IsPrime(a))
		 {
			System.out.println("Is Prime"); 
		 }
		 else
		 {
			 System.out.println("Not Prime");
		 }
				 
		 }
		
	}
	
