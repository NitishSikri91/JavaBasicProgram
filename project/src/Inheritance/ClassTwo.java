package Inheritance;

import java.util.Scanner;

public class ClassTwo extends ClassOne {

	//Global Varibales
	int x1,x2;
	
	
	public static void main(String[] args) {
		
		ClassTwo CL2_OBJ = new ClassTwo();
		ClassThree CL3_OBJ = new ClassThree();
		Scanner scan = new Scanner(System.in);				
		
		/*CL2_OBJ.Method1();
		CL2_OBJ.Method2();
		CL3_OBJ.Method3();
		CL3_OBJ.Method5(new ClassTwo());*/
		
/*		System.out.println("Lets add two numbers");
		System.out.println("Please enter first digit");
		int a = scan.nextInt();
		System.out.println("Please enter second digit");
		int b = scan.nextInt();
		
		CL3_OBJ.Method6(a,b);
*/
			CL3_OBJ.Method7(10,11);
			
			System.out.println(CL3_OBJ.x + " Global from Class three " + CL3_OBJ.y);
		
		//System.out.println(CL3_OBJ.Class3Int +" "+ CL3_OBJ.Class3Str);
	
		
		
		
		
	}
	
}



