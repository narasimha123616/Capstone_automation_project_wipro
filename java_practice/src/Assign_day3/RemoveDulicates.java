package Assign_day3;
import java.util.LinkedHashSet;
public class RemoveDulicates {
	public static void main(String[] args) {
       
        int[] numbers = {10, 20, 10, 30, 40, 20, 50};

        LinkedHashSet<Integer> uniqueSet = new LinkedHashSet<>();

        for (int num : numbers) {
            uniqueSet.add(num);
        }
        System.out.println("Original Array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println("\n\nArray after removing duplicates:");
        for (int num : uniqueSet) {
            System.out.print(num + " ");
        }
    }
}
