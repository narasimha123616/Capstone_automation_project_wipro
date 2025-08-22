package Assign_day3;

public class SecondHigh {
	 public static void main(String[] args) {
	       
	        int[] numbers = {45, 22, 89, 33, 89, 90, 76};

	        int highest = Integer.MIN_VALUE;
	        int secondHighest = Integer.MIN_VALUE;

	      
	        for (int num : numbers) {
	            if (num > highest) {
	                secondHighest = highest;
	                highest = num;
	            } else if (num > secondHighest && num != highest) {
	                secondHighest = num;
	            }
	        }

	      
	        System.out.println("Array Elements:");
	        for (int num : numbers) {
	            System.out.print(num + " ");
	        }

	        if (secondHighest == Integer.MIN_VALUE) {
	            System.out.println("\nNo second highest element found (all elements might be equal).");
	        } else {
	            System.out.println("\nSecond Highest Element: " + secondHighest);
	        }
	    }
}
