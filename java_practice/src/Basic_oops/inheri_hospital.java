package Basic_oops;
 class hospital
 {
	 void Doctor()
	 {
		 System.out.println("Type of Doctors");
	 }
	 void nurse() {
		 System.out.println("Nurse");
	 }
	 void administrators()
	 {
		 System.out.println("Types of administrators");
	 }
 }
  
 class Doctors extends hospital
 {
	 void Gynac()
	 {
		 System.out.println("Gynacolyst");
	 }
	 void Endo()
	 {
		 System.out.println("Endologist");
	 }
	 void cardiac()
	 {
		 System.out.println("cardiologist");
	 }
 }
 
 class Administration extends hospital
 {
	 void payments()
	 {
		 System.out.println("Billing payments");
	 }
	 void Documentation()
	 {
		 System.out.println("Documents verification");
	 }
	 
 }
 
 class cardia extends cardiac 
 {
	 
 }
 
public class inheri_hospital {
 
}
