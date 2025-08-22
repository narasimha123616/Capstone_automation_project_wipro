package Assign_day3;
import java.util.HashMap;
public class ElementFrequency {
	 public static void main(String[] args) {
	       
	        int[] numbers = {10, 20, 10, 30, 20, 40, 10, 50, 20};

	        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

	        for (int num : numbers) {
	            if (frequencyMap.containsKey(num)) {
	                frequencyMap.put(num, frequencyMap.get(num) + 1);
	            } else {
	                frequencyMap.put(num, 1);
	            }
	        }
	        System.out.println("Frequency of each element:");
	        for (int key : frequencyMap.keySet()) {
	            System.out.println(key + " → " + frequencyMap.get(key));
	        }
	    }
}
