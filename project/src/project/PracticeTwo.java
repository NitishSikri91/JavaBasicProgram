package project;

public class PracticeTwo {

	static int count=0;

	void Method1()
	{
		System.out.println("I am Method1");
	}
	
	void Method2()
	{
		this.Method1();
		System.out.println("I am method 2");
	}
	
	static void Display()
	{
		System.out.println("I am inside a static menthod");
		count = 101;
	
	}
	public PracticeTwo() {
	
		count++;
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*PracticeTwo obj1 = new PracticeTwo();
	PracticeTwo.Display(); // Calling static function without creating object of class
	System.out.println(count);*/
		
		
		
	}

}
