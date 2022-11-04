//write a java program to print multiplication table. i/p:-5
package basicprogram;

public class Nov4Task2 {

	public static void main(String[] args)
	{
		
		// number n for which we have to print the multiplication table.
		 int N = 5;
		 
	   // looping from 1 to 10 to print the multiplicatio table of the number using for loop
		for (int i = 1; i <= 10; i++) 
		   {
		      // printing the N*i,ie ith multiple of N.
		      System.out.println(N + " * " + i + " = "
		                               + N * i);
		   }
	 }
		
}


