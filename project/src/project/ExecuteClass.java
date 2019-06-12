package project;

public class ExecuteClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Child103 c = new Child103("Akhil", "Hno 101", 1001, 1000.00);
	System.out.println("Mail info from child");
	c.mailCheck();
	Parent102 p= new Child103("Zack", "Palm Groove", 1005 , 17000.00);
	
	System.out.println("Mail info from Parent");
	p.mailCheck();
	}

}
 