package AssignmentWithSuperAndThis;

public class ChildClass extends Parent {
	//Constructors 
	public ChildClass() {
		this(20);
	System.out.println("Child defautl");}
	
	public ChildClass(int a) {
		this(10, 20, 30);
		System.out.println("Child 1 param constructor");
		}
		
	public ChildClass(int a , int b ) {
		this();
		System.out.println("Child 2 param constructor");
		}
		
	public ChildClass(int a , int b , int c) {
		super(10,20);
		System.out.println("Child 3 param constructor ");
		}
		
		
	///Methods
	public void ChildClass1() {
		this.ChildClass2(10);
	System.out.println("Default Child Method");	}
	public void ChildClass2(int a) {
		this.ChildClass4(10, 20, 30);
		System.out.println("Child Method with 1 param");
		}	
	public void ChildClass3(int a, int b) {
		this.ChildClass1();
		System.out.println("Child Method with 2 param");
		}
	public void ChildClass4(int a, int b , int c) {
				super.Parent3(10, 20);
		System.out.println("Child Method with 3 param");
		}
	
	public static void main(String[] args) {
		ChildClass obj1ChildClass = new ChildClass(10,10);
		//obj1ChildClass.ChildClass3(10, 20);
		
	}
}
