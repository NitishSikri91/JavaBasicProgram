package project;

public abstract class Parent102 {

		   private String name;
		   private String address;
		   private int number;

		   public Parent102(String name, String address, int number) {
		      System.out.println("Constructing an Employee from Parent Class");
		      this.name = name;
		      this.address = address;
		      this.number = number;
		   }
		   
		   public double computePay() {
		     System.out.println("Inside Employee computePay");
		     return 0.0;
		   }
		   
		   public void mailCheck() {
		      System.out.println("Mailing a check from papa class " + this.name + " " + this.address);
		   }

		   public String toString() {
		      return name + " " + address + " " + number;
		   }

		   public String getName() {
		      return name;
		   }
		 
		   public String getAddress() {
		      return address;
		   }
		   
		   public void setAddress(String newAddress) {
		      address = newAddress;
		   }
		 
		   public int getNumber() {
		      return number;
		   }
		}
