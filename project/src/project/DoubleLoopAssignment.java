package project;

public class DoubleLoopAssignment {

	
	public static void main(String[] args) {

			System.out.println("I am the change !!");
		for(int i=1;i<=5;i++)
		{
		for (int j=1;j<=(5-i);j++)
		{
			System.out.print(" ");
		}
		
		for (int k=1;k<=i;k++)
		{
			System.out.print("*");
		}
		for (int l=1;l<i;l++ )
		{
			System.out.print("*");
		}
			
	System.out.println();
	}
	
		}
	

}
