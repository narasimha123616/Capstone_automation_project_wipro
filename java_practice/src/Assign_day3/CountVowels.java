package Assign_day3;

public class CountVowels {
	
	    public static void main(String[] args) {
	        String input = "Programming";
	        int vowelCount = 0;

	        input = input.toLowerCase();

	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);

	   
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                vowelCount++;
	            }
	        }

	        System.out.println("Input: " + input);
	        System.out.println("Output: " + vowelCount + " Vowels");
	    }
	}


