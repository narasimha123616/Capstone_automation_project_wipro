package Assign_day3;

public class CopyArray {
	 public static void main(String[] args) {
	        
	        int[] originalArray = {10, 20, 30, 40, 50};

	        int[] copiedArray = new int[originalArray.length];

	        for (int i = 0; i < originalArray.length; i++) {
	            copiedArray[i] = originalArray[i];
	        }

	        System.out.println("Original Array:");
	        for (int num : originalArray) {
	            System.out.print(num + " ");
	        }

	        System.out.println("\nCopied Array:");
	        for (int num : copiedArray) {
	            System.out.print(num + " ");
	        }
	    }
}
