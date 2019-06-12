package edurekaLearn;

import java.util.ArrayList;
import java.util.Iterator;

public class arryListPractice {

	public static void main(String[] args) {

//Declaring Array list for string type
		ArrayList<String> List1 = new ArrayList<String>();
		
//Declaring Array list for open data types 
		ArrayList List2 = new ArrayList();
		
//Inserting values in the list 
		List1.add("Jack");
		List1.add("John");
		List1.add("Jimmy");
		List1.add("Jonny");
		List1.add("James");
//List1.add(10); - Since list 1 is string type we cannot assign value other than string 

		//Inserting values in the List 2
		List2.add("Hamon");
		List2.add(101);
		List2.add('M');
		
		
//Let us try printing the output values from the list 
		System.out.println("Values in List1 is " + List1);
		System.out.println("Values in List2 is " + List2);
		

// Getting values from a list 
		String name = List1.get(2);
		System.out.println("Name of person at 2nd index is " + name);

		Object o = List2.get(0);		
		System.out.println("Value at index 1 of list 2 is " + List2.get(1) ); 
		System.out.println("Value at index 0 of list 2 is " + o );
		
// Updating the values inside a list
		
		List1.set(2, "Jikky");
		System.out.println("After replacing the new list is  ");
		System.out.println("Values in List1 is " + List1);
		
// Removing the element 
		List1.remove(2);
		System.out.println("After removal the new list is "+ List1);
		
		
// List1.clear(); - To remove all the values in the list 
		
// Searching in List
		
		if (List1.contains("John"))
		{System.out.println("John is in the list");}
		else
		{System.out.println("John is not in the list");}
		
		// Iteration in a list 
		System.out.println("Length of List 1 is" + List1.size());
		
		// Tradational looping 
		System.out.println("************************");
		System.out.println("Iteration with tradition loop");
		
		for (int i=0;i<List1.size();i++)
		{
			System.out.println(List1.get(i));
		}
		
		System.out.println("************************");
		System.out.println("Iteration with enhance for loop ");
		System.out.println("************************");
		for(String str : List1 )
		{System.out.println(str);}
		System.out.println("************************");
		
		System.out.println("************************");
		System.out.println("Iteration with iterator ");
		
// Iterator is an API 
//Iterator method iterator() , in array list will give us reference to iterator 
// Iterator <String> - API Iterator of type string
		Iterator<String> itr = List1.iterator();
	
// itr will give the value of the next element in the loop , it is pointing to the last value in array list 
// and next() will pick the next value. WIll give the element one by one ...
//System.out.println(itr.next());
		
	/* Let us print first value without loop
		System.out.println("First value in the Array list is "+ itr.next());
System.out.println("Looping for the remaining values in list ");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		*/		
// Removing values from the list using iterator..
	
		System.out.println("Before 1removing values fromt he array "+ List1);
		System.out.println("************************");
		
		System.out.println("Removing values");
		while(itr.hasNext())
		{
			if (itr.next().equals("Jack"))
			{
				itr.remove();
			}

		}
		
System.out.println("After removing values fromt he array "+ List1);		
		
		
		
		
		
		
		
		
	}
	
	

}
