package Assign_day3;

public class CheckString {
	
	    public static void main(String[] args) {
	        String input = "java";

	        input = input.toLowerCase();

	        if (input.startsWith("j") && input.endsWith("a")) {
	            System.out.println("The string \"" + input + "\" starts with 'j' and ends with 'a'.");
	        } else {
	            System.out.println("The string \"" + input + "\" does NOT start with 'j' and end with 'a'.");
	        }
	    }
	}
 


