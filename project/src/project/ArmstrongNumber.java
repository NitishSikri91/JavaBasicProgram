package project;

import java.util.Scanner;

public class ArmstrongNumber {

	
	public static void main(String[] args) {

		System.out.println("Please enter a number to check for Armstrong");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int origNumber = number;		
		int remainder;
		int sum =0;
		int temp;
		System.out.println("Enterd number is "+ origNumber);
		while (number>0)
		{
		remainder= number%10;
		System.out.println("Remainder is "+ remainder);
		temp = remainder*remainder*remainder;
		System.out.println("Cube of remainder is " +temp );
		sum = sum + temp;
		System.out.println("Current Sum is "+ sum);
		number=number/10;
		System.out.println("Remaining number is "+ number);
		}
		
		if(origNumber==sum)
		{System.out.println("Number is Armstrong");}

		else
		{System.out.println("Number is not Armstrong");}
			
				
		
	}

}
