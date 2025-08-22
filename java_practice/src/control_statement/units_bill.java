package control_statement;

public class units_bill {

	public static void main(String[] args) {
		
		int unit=110;
		if(unit>=500 && unit<=501) {
			System.out.println("Very High Usage");
		}
		
		 else if(unit>300 && unit<=499) {
			System.out.println(" High Usage");
		}
		 else if(unit>100 && unit<=299) {
			System.out.println(" Medium Usage");
		}
		  else if(unit<=100) 
		 {
			System.out.println(" Low Usage");
		}
		  else
		 {
			System.out.println("Invalid");
		}	 
	}
}
