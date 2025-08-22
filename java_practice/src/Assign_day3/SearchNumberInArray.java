package Assign_day3;
import java.util.Scanner;
public class SearchNumberInArray {
	 public static void main(String[] args) {
	        
	        int[] numbers = {10, 20, 30, 40, 50, 60, 70};

	        Scanner sc = new Scanner(System.in);

	        
	        System.out.print("Enter a number to search: ");
	        int searchNum = sc.nextInt();

	        boolean found = false;

	       
	        for (int i = 0; i < numbers.length; i++) {
	            if (numbers[i] == searchNum) {
	                System.out.println("Number " + searchNum + " found at index " + i);
	                found = true;
	                break;
	            }
	        }

	        if (!found) {
	            System.out.println("Number " + searchNum + " not found in the array.");
	        }

	        sc.close();
	    }
}
