package Assign_day3;

public class PalindromeCheck {

	    public static void main(String[] args) {
	        String input = "ATTA";

	        input = input.toLowerCase();

	        String reversed = "";
	        for (int i = input.length() - 1; i >= 0; i--) {
	            reversed += input.charAt(i);
	        }

	        if (input.equals(reversed)) {
	            System.out.println("The string \"" + input + "\" is a Palindrome.");
	        } else {
	            System.out.println("The string \"" + input + "\" is NOT a Palindrome.");
	        }
	    }
	}


