package project;

public class FibboSeries {

	public static void main(String[] args) {
		int i = 0;
		int j = 1;
		int sum=i+j;
		int newSum;
		System.out.println(i);
		System.out.println(j);
		System.out.println(sum);
		
		for (int a=1;a<=10;a++)
		{
			i=j;
			j=sum;
			sum=i+j;
			System.out.println(sum);
			
		}
		
		
		
	}

}
