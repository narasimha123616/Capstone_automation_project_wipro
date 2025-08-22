package Assign_day3;

public class PrimeInArray {
	public static boolean isPrime(int num) {
        if (num <= 1) return false;  // 0 and 1 are not prime
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5, 10, 13, 17, 22, 29, 33};

        System.out.println("Prime numbers in the array:");
        for (int num : numbers) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }
}








