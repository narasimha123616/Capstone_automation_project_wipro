package Assign_day3;
import java.util.Arrays;
public class SortAlphabatically {
	  public static void main(String[] args) {
	        String input = "programming";

	       
	        char[] chars = input.toCharArray();
	        Arrays.sort(chars);

	        String sortedString = new String(chars);

	        System.out.println("Original String: " + input);
	        System.out.println("Sorted Characters: " + sortedString);
	    }
}
