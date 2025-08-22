package control_statement;

public class student_eligible_scholorship {

	public static void main(String[] args) {
		int marks=80;
		boolean reserved_category=true;
		if(marks>=81 && reserved_category) {
			System.out.println("Eligible for scholorshilp");
		}
		else {
			System.out.println(" NOt Eligible for scholorshilp");
		}
	}
}
