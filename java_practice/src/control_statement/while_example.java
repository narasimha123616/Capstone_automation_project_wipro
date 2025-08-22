package control_statement;

//public class while_example {
//
//	public static void main(String[] args) {
//		int i=65;
//	
//		while(i<=88) {
//			System.out.println(i);
//			i++;
//		}
//	}
//}
public class while_example{
    public static void main(String[] args) {
        char ch = 'A';

        System.out.println("Uppercase Letters and their ASCII values:");
        while (ch <= 'Z') {
            System.out.println(ch + " = " + (int) ch);
            ch++;
        }	

        ch = 'a';  // Reset ch to lowercase start

        System.out.println("\nLowercase Letters and their ASCII values:");
        while (ch <= 'z') {
            System.out.println(ch + " = " + (int) ch);
            ch++;
        }
    }
}
