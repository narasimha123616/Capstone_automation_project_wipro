//package control_statement;
//
//import java.util.Scanner;
//
//public class registration {
// public static void main(String[] args) {
//	 Scanner sc=new Scanner(System.in);
//	 System.out.println("Enter your Full name");
//	 String name=sc.nextLine();
//	 System.out.println("Enter your number");
//	 long number=sc.nextLong();
//	 sc.nextLine();
//	 System.out.println("Enter your email");
//	 String email=sc.nextLine();
//	 System.out.println("Enter your username");
//	 String username=sc.nextLine();
//	 System.out.println("Enter your password");
//	 String password=sc.nextLine();
//	 System.out.println("Enter your conpass");
//	 String conpass=sc.nextLine();
//	 
//	 
//	 System.out.println("Name"+name);
//	 System.out.println("Number"+number);
//	 System.out.println("email"+email);
//	 System.out.println("username"+username);
//	 System.out.println("password"+password);
//	 System.out.println("conpass"+conpass);
//	 
// }
//}
package control_statement;

import java.util.Scanner;

public class registration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user inputs
        System.out.println("Enter your Full name:");
        String name = sc.nextLine();

        System.out.println("Enter your 10-digit number:");
        String numberStr = sc.nextLine();

        System.out.println("Enter your email:");
        String email = sc.nextLine();

        System.out.println("Enter your username:");
        String username = sc.nextLine();

        System.out.println("Enter your password:");
        String password = sc.nextLine();

        System.out.println("Confirm your password:");
        String conpass = sc.nextLine();

        // Validation
        boolean isValid = true;

        if (name.isEmpty()) {
            System.out.println("Error: Name cannot be empty");
            isValid = false;
        }

        if (!numberStr.matches("\\d{10}")) {
            System.out.println("Error: Phone number must be exactly 10 digits");
            isValid = false;
        }

        if (!email.contains("@") || !email.contains(".")) {
            System.out.println("Error: Invalid email format");
            isValid = false;
        }

        if (username.length() < 4) {
            System.out.println("Error: Username must be at least 4 characters long");
            isValid = false;
        }

        if (password.length() < 6) {
            System.out.println("Error: Password must be at least 6 characters long");
            isValid = false;
        } else if (!password.equals(conpass)) {
            System.out.println("Error: Password and Confirm Password do not match");
            isValid = false;
        }

        // Final Output
        if (isValid) {
            System.out.println("\n✅ Registration Successful!");
            System.out.println("Name: " + name);
            System.out.println("Number: " + numberStr);
            System.out.println("Email: " + email);
            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
        } else {
            System.out.println("\n❌ Registration Failed. Please correct the errors above.");
        }

        sc.close();
    }
}
