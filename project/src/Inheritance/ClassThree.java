package Inheritance;

public class ClassThree {
	//Global var of class3
	int Class3Int = 101;
	String Class3Str = "Dummy";
	int x,y;
	
	
	public void Method3()
	{
		
		System.out.println("I am Method Three from Class Three");
		this.Method4();
	}
	
	public void Method4()
	{
		System.out.println("I am Method four from Class Three");
	}
	
	public void Method5(ClassTwo obj)
	{
		System.out.println("I am Method five from Class Three");
	
		// Methods from Class One
		obj.Method1(); 
		obj.Method2();
	}
	
	public void Method6(int a , int b)
	{
		System.out.println("I am Method six from Class Three");
		int c = a+b;
		System.out.println("And the sum is" +c);
	}
	
	public void Method7(int x, int y)
	{
		System.out.println("I am Method Seven from Class Three");
		this.x=x;
		this.y=y;
		
	}
	

}
