package Assign_day3;

public class MaxMInArray {
	public static void main(String[] args) {
       
        int[] numbers = {25, 89, 12, 56, 90, 3, 77};

        
        int max = numbers[0];
        int min = numbers[0];

        
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

      
        System.out.println("Array Elements:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println("\nMaximum Element: " + max);
        System.out.println("Minimum Element: " + min);
    }
}
