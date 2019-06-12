package project;

public class Child103 extends Parent102 {

	private double salary;
	
	public Child103(String name, String address, int number, double Salary)
	{
	super(name,address,number);
	this.salary=Salary;
	}
	
	public void mailCheck()
	{
		System.out.println("Child mail check function");
		System.out.println("Mailing check to " + getName() + " with salary " + salary);
	}
	
	public double getSalary()
	{
	return salary;
	}
	
	
	
}
