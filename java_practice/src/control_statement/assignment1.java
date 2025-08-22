package control_statement;
import java.util.Scanner;
public class assignment1 {
 public static void main(String[] args) {
	 
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter your number");
	 int num=sc.nextInt();
	 if(num%2==0) {
		System.out.println("Eeven"); 
	 }
	 else {
		 System.out.println("odd");
	 }
 }
}
