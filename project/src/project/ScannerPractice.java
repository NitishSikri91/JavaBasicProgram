package project;
import java.util.Scanner;
public class ScannerPractice {

	int age=0; 
	public static void main(String[] args) {
			
	Scanner sc = new Scanner(System.in);
	
	int temp1=0;
	String name ="";
	
	System.out.println("Enter Age");
	
	if(sc.hasNextInt())
	{
	temp1 = sc.nextInt();
	}
	else
	{
	System.out.println("Enter valid age value");	
	}
	 
	
	System.out.println("Enter Name");
	if(sc.hasNextDouble())
	{
		name = sc.nextLine();
	}
	else
	{
	System.out.println("Enter valid name");	
	}
	
	
	System.out.println(name + " "+ temp1);
		}
	
}
