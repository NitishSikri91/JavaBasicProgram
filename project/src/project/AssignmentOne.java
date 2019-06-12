package project;
public class AssignmentOne {
	
	public AssignmentOne()
	{
		this(10,20,30);	
		System.out.println("Default Constructor ");
	}
	
	public AssignmentOne(int a)
	{
		this( 10,20);
		System.out.println("Constructor with 1 param " + a );
	}
	
	public AssignmentOne(int a, int b)
	{
		this();
		System.out.println("Constructor with 2 param " + a +" and "+  b);
	}
	
	public AssignmentOne(int a, int b, int c)
	{
		System.out.println("Constructor with 3 param " + a +", " + b + " and " + c);
	}
	
	public static void main(String[] args) {
		{
			AssignmentOne Ref_Obj = new AssignmentOne(20);
			
		}
	}
}
