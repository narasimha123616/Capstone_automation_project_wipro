package control_statement;

public class for_loop {

//	public static void main(String[] args) {
//	int i,j;
//	for(i=1;i<6;i++) {
//		for(j=1;j<i;j++) {
//			System.out.print(" ");
//		}
//		System.out.println();
//	}
//}
	
	
	public static void main(String[] args) {
	
		   
		        int rows = 5;  // You can change this to any number

		        for (int i = 1; i <= rows; i++) {
		            // Print spaces first
		            for (int j = 1; j <= (rows - i); j++) {
		                System.out.print("  ");  // Two spaces for alignment
		            }

		            // Then print stars
		            for (int k = 1; k <= i; k++) {
		                System.out.print("* ");
		            }

		            System.out.println();  // Move to next line
		        }
		    }
		}

	

