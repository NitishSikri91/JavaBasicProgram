package AssignmentWithSuperAndThis;

public class Parent {

	//Constructors 
	
	Parent()
	{
		this(10, 10, 10);
System.out.println("Parent default constructor");		
	}
	
	Parent(int a)
	{
		this();
		System.out.println("Parent 1 param constructor");
	}
	
	Parent(int a , int b)
	{
		this(10);
		System.out.println("Parent 2 param constructor");
	}
	
	Parent(int a , int b , int c )
	{
		System.out.println("Parent 3 param constructor");
	}
	
	
	//Methods
	public void Parent1() {
		this.Parent4(1, 2, 3);
	System.out.println("Parent default Method ");
	}
	
	public void Parent2(int a) {
		this.Parent1();
	System.out.println("Parent Method with 1 param");
	}
	
	public void  Parent3(int a , int b) {
		this.Parent2(10);
	System.out.println("Parent Method with 2 param");
	}

	public void Parent4 (int a, int b , int c) {
	System.out.println("Parent Method with 3 param");
	}
	
}
