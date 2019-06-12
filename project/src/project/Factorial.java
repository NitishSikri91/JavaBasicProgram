package project;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		System.out.println("Please enter a number to calculate for factorial");
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		int fact =1;
		
		while(i>1)
		{
			fact = fact * i;
			i= i-1;
		}
		
		System.out.println("Factorial of the number is "+ fact);
		
		

	}

}
