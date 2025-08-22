package Assign_day3;

public class SumOfAllElements {
	public static void main(String[] args) {
     
        int[] numbers = {10, 20, 30, 40, 50};

        int sum = 0;

       
        for (int num : numbers) {
            sum += num;
        }

      
        System.out.println("Array Elements: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println("\nSum of all elements: " + sum);
    }
}a
