package project;

public class ConstructorAssignTwo {

	int a,b;
		
	
	//Default Construct
	public ConstructorAssignTwo(int x , int y)
	{
		this.a=x;
		this.b=y;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorAssignTwo Obj1= new ConstructorAssignTwo(10, 20);
		ConstructorAssignTwo Obj2= new ConstructorAssignTwo(11, 21);
		
		System.out.println("Object 1 output for the value stote in int a "+ Obj1.a);
		System.out.println("Object 1 output for the value stote in int b "+ Obj1.b);
		System.out.println(Obj2.a);
		System.out.println(Obj2.b);
		
	}

}
