package dec01_2022;

public class NegativeNumbers {
	
		
		public static void main(String[] args) {
			int j = 0;
			int[] Neg_arr = {-40, 15, -4, 11, -8, -13, 22, 16, -11, -99, 55, 18, -60};
			
			
			System.out.print("\nList of Negative Numbers in NEG Array : \n ");
			while(j < Neg_arr.length) 
			{
				if(Neg_arr[j] < 0) {
					System.out.println( Neg_arr[j]);
				}
				j++;
			}
		}
	}
