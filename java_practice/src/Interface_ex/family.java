package Interface_ex;


	interface parent1
	{
		void flat();
		void car();
	}
	 interface parent2
	 {
		 void flat();
		 void bike();
	 }
	 
	 class child implements parent1,parent2
	 {
		 public void bike()
		 {
			 System.out.println("bike");
		 }
		 public void car()
		 {
			 System.out.println("bike");
		 }
		 public void flat()
		 {
			 System.out.println("bike");
		 }
	 }
	 public class family {
		 public static void main(String[] args) {
			 child c =new child();
			 c.flat();
			 c.bike();
			 c.car();
		 }
	 }



