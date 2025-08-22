package Assign_day3;

public class ReverseArray {

public static void main(String[] args) {
 
    int[] numbers = {10, 20, 30, 40, 50};

    System.out.println("Original Array:");
    for (int num : numbers) {
        System.out.print(num + " ");
    }

    System.out.println("\n\nArray in Reverse Order:");
    for (int i = numbers.length - 1; i >= 0; i--) {
        System.out.print(numbers[i] + " ");
    }
}
}
