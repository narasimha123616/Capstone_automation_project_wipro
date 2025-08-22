package Assign_day3;
import java.util.HashMap;
public class FrequencyOfCharacter {
	
public static void main(String[] args) {
    String input = "programming";

    // Convert to lowercase (optional) and remove spaces if needed
    input = input.toLowerCase().replaceAll("\\s", "");

    // Create a HashMap to store character frequencies
    HashMap<Character, Integer> freqMap = new HashMap<>();

    // Loop through each character
    for (char ch : input.toCharArray()) {
        if (freqMap.containsKey(ch)) {
            freqMap.put(ch, freqMap.get(ch) + 1);
        } else {
            freqMap.put(ch, 1);
        }
    }

    // Display character frequencies
    System.out.println("Character frequencies:");
    for (char key : freqMap.keySet()) {
        System.out.println(key + " → " + freqMap.get(key));
    }
}
}
