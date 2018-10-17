import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
			// create a new array
            System.out.println();
            System.out.println("Enter the size of the array to be created - must be between 3 and 10");
            int arraySize = sc.nextInt();
            int [] createdArray = new int [arraySize];
            
            fillArray(createdArray);
            printArray(createdArray);
            sortArray(createdArray);
            
            }
	
	
	//method to fill up the array with a for loop
	public static void fillArray(int[] createdArray) {
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < createdArray.length; ++i) {
        	System.out.println("Enter the value of index[" + i + "]");
        	createdArray[i] = sc.nextInt();
		}
	}
	//method to print the array as entered
	public static void printArray(int[] createdArray) {
		System.out.println("The values of the array are: ");
		for (int i = 0; i < createdArray.length; ++i) {
        	System.out.println(createdArray[i]);
		}
		
	}
	
	public static void sortArray(int[] array) {
		
		boolean swapped;
		
		do {
			swapped = false;
			
			for (int i = 0; i < array.length-1; ++i) {
			
				if (array[i] > (array[i+1])) {
					int temp = array[i+1];
                    array[i+1] = array[i];
                    array[i]=temp;
					swapped = true;
				
				}  // end if statement
			} // end for loop
		} while (swapped == true);
		
		System.out.println("The values of the sorted array are: ");
		for (int i = 0; i < array.length; ++i) {
        	System.out.println(array[i]);
		}
	} // end sortArray

} //end application
