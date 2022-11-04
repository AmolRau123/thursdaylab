package basicprogram;
import java.util.Scanner;
public class Nov4Task1 {

	public static void main(String[] args)
	{
		
	 //Scanner class object created
	 Scanner in = new Scanner(System.in);
		        
	 //integer variable 'N' taken to hold an integer number 
	 int N;
	 int evenSum = 0;
    //taking the number value input from user
	 System.out.print("Enter a number: ");
	 N = in.nextInt();
		        
     //for loop to iterate from 0 to N
     for(int i = 0; i <= N; i++)
		 {
		   //if number is even then add it to 'evenSum'
		   if((i%2) == 0)
		       {
		          evenSum += i;
		       }
		 }
		        
	//printing result
System.out.print("Sum of all even numbers between 0 to "+ N + " = " + evenSum);
		    }
	}


