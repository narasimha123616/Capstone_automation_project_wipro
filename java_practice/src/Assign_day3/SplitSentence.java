package Assign_day3;
import java.util.Arrays;
public class SplitSentence {
	 public static void main(String[] args) {
	    
	        int[] numbers = {40, 10, 30, 20, 50};

	        //
	        System.out.println("Original Array:");
	        for (int num : numbers) {
	            System.out.print(num + " ");
	        }

	        Arrays.sort(numbers);

	        System.out.println("\n\nSorted Array (Ascending Order):");
	        for (int num : numbers) {
	            System.out.print(num + " ");
	        }
	    }
}
