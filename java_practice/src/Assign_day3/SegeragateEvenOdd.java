package Assign_day3;

public class SegeragateEvenOdd {
	public static void main(String[] args) {
        int[] arr = {12, 7, 5, 10, 8, 3, 6};

        System.out.println("Original Array:");
        printArray(arr);

        System.out.println("\nEven Numbers:");
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        System.out.println("\n\nOdd Numbers:");
        for (int num : arr) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
