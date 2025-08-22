package Assign_Day2;
import java.util.Scanner;
public class prime_number {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		if(num % 2 == 0) {
			System.out.println(num +" is not a prime number");
		}
		else
			System.out.println(num +" is a prime number");

	}

}
