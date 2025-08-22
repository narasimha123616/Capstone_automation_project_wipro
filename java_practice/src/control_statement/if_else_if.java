package control_statement;

public class if_else_if {

	public static void main(String[] args) {
		float percentage=90.8f;
		if(percentage>=91&& percentage<=100 ) {
			System.out.println(" Passed in First class");
		}
		else if(percentage>=61 && percentage<=91) {
			System.out.println("Passed in second class");
		}
		else if(percentage>=41 && percentage<=60) {
			System.out.println("Passed in Third class");
		}
		else if(percentage>=0 && percentage<=40){
			System.out.println("Failed");
		}
		else {
			System.out.println("Invalid input");
		}
	}
}
