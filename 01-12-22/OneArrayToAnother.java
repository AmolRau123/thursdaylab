package dec01_2022;

public class OneArrayToAnother {
  public static void main(String[] args) {
	 //Initializing an array
	 int [] firstArray = new int [] {3, 5, 7, 9, 11};
		    
     int secondArray[] = new int[firstArray.length];

	//Displaying elements of first array
	System.out.println("Elements of First array: ");
	for (int i = 0; i < firstArray.length; i++) {
	System.out.print(firstArray[i] + " ");
	}

    //Copying all elements of firstArray to secondArray
	 for (int i = 0; i < firstArray.length; i++) {
	  secondArray[i] = firstArray[i];
	}

    //Displaying elements of secondArray
	System.out.println();
    System.out.println("Elements of Copied array: ");
    for (int i = 0; i < secondArray.length; i++) {
    System.out.print(secondArray[i] + " ");
    }
   }
  }    
