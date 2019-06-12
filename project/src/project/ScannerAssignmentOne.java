package project;
import java.util.Scanner;


/*Target is to print ((((a+b)-c)*d)/e) but inputs should be taken and passed to correct method
*/

public class ScannerAssignmentOne {

	int a , b, c, d,e;
	
	public int Sum(int a, int b)
	{
		int Sum=a+b;
		return Sum;
	}	
	public int Sub(int a, int b)
	{
		int Sub=a-b;
		return Sub;
	}
	public int Mult (int a, int b)
	{
		int Mult=a*b;
		return Mult;
	}
	public int Div(int a, int b)
	{
		int Div=a/b;
		return Div;
	}
	
	public static void main(String[] args) {
	ScannerAssignmentOne Obj1= new ScannerAssignmentOne();
		Scanner ScanObj = new  Scanner(System.in);
		System.out.println("Hi There , we are trying to sove the equation ((((a+b)-c)*d)/e)");
		System.out.println("Please enter the value of a "); 
		Obj1.a = ScanObj.nextInt();
		System.out.println("Please enter the value of b ");
		Obj1.b = ScanObj.nextInt();
		System.out.println("Please enter the value of c ");
		Obj1.c = ScanObj.nextInt();
		System.out.println("Please enter the value of d ");
		Obj1.d = ScanObj.nextInt();
		System.out.println("Please enter the value of e ");
		Obj1.e = ScanObj.nextInt();
	
	
		int x = Obj1.Div(Obj1.Mult(Obj1.Sub(Obj1.Sum(Obj1.a, Obj1.b), Obj1.c), Obj1.d), Obj1.e);
		System.out.println("Result of the calc is " + x);
		
	}
	
}
