package control_statement;

public class if_else {
	public static void main(String[] args) {
		int age=18;
		boolean id=true;
		boolean student=true;
		if(age>=18 ) {
			System.out.println("person is allowed ");
		}
		if(age>=18 && id) {
			System.out.println("person is allowed and not gets discount");
		}
		else {
			System.out.println(" person not allowed and gets discount");
		}
		
	}
}
