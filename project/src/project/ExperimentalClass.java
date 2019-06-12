package project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

// This calss test the experiment with the Buffer Reader vs the Scnner class
public class ExperimentalClass {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		System.out.println("Please enter corporate email id :");
		String EmailId = br.readLine();
		System.out.println("Entered eamil id is " + EmailId);
		
		
		
	}
	
	
	
}
