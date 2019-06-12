package project;

public class DummyOne {

	int b;
	String name;
	
	public DummyOne() {
		// TODO Auto-generated constructor stub
	}
	public DummyOne(int i , String a) {
		// TODO Auto-generated constructor stub
	b=i;
	name=a;
	}
	
	public static void main(String[] args) {
		
		DummyOne Obj1 = new DummyOne(12,"Test");
		DummyOne Obj2 = new DummyOne();
		
	System.out.println("Number is " + Obj1.b +" and Name is " + Obj1.name);	
		
	Obj2.b= Obj1.b;
	Obj2.name=Obj1.name;
	
	System.out.println("Number is " + Obj2.b +" and Name is " + Obj2.name);
		
	}
	
	
	
}
