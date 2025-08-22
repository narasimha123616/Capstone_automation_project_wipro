package Assign_day3;
import java.util.Arrays;
public class MergeAndSortArrays {
	 public static void main(String[] args) {
	        
	        int[] array1 = {30, 10, 50};
	        int[] array2 = {20, 40, 60};

	        int[] mergedArray = new int[array1.length + array2.length];

	        for (int i = 0; i < array1.length; i++) {
	            mergedArray[i] = array1[i];
	        }

	        for (int i = 0; i < array2.length; i++) {
	            mergedArray[array1.length + i] = array2[i];
	        }

	        Arrays.sort(mergedArray);

	        System.out.println("Merged and Sorted Array:");
	        for (int num : mergedArray) {
	            System.out.print(num + " ");
	        }
	    }
}
