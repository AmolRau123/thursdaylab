// write a java program to calculate a factorial number
package basicprogram;
import java.util.Scanner;
public class Nov4Task4{
	public static void main(String[] args) 
	{
		
		        int num;
		        long factorial = 1;
		        Scanner sc=new Scanner(System.in);
		        System.out.println("Enter number:");
		        num=sc.nextInt();
		        for(int i = 1; i <= num; ++i)
		        {
		            // factorial = factorial * i;
		            factorial *= i;
		        }
		        System.out.printf("Factorial of %d = %d", num, factorial);
		    }
		
	}


