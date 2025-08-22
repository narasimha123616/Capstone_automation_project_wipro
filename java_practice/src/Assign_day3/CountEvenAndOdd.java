package Assign_day3;

public class CountEvenAndOdd {
	 public static void main(String[] args) {
	        
	        int[] numbers = {10, 23, 45, 66, 78, 89, 90};

	        int evenCount = 0;
	        int oddCount = 0;

	    
	        for (int num : numbers) {
	            if (num % 2 == 0) {
	                evenCount++;
	            } else {
	                oddCount++;
	            }
	        }

	     
	        System.out.println("Array Elements:");
	        for (int num : numbers) {
	            System.out.print(num + " ");
	        }

	        System.out.println("\nTotal Even Numbers: " + evenCount);
	        System.out.println("Total Odd Numbers: " + oddCount);
	    }
}
