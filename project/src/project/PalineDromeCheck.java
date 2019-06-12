package project;

import java.util.Scanner;

public class PalineDromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please enter a positive interger");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int origNumber=a;
		int remainder, sum=0;
		
		while(a!=0)
		{
			System.out.println("Input number is "+ a);
			remainder = a%10;
			System.out.println("Last digit it "+ remainder);
			System.out.println("Last digit "+ remainder + "Added to sum "+ (sum*10));	
			sum = sum*10+remainder;
			a=a/10;
		}
		
		System.out.println("Reversed number is " + sum);
		
		if (sum==origNumber)
		{
			System.out.println("Number is Palindrome");
		}
		
		else
		{
			System.out.println("Number is not Palindrome");
		}
		
		
	}

}
