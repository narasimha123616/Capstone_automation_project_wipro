package Interface_ex;
// interface Animal
// {
//	 void eat();
//	 void sound();
//	 String name="kjgdkug";
//	 default void show()
//	 {
//		 System.out.println("nara");
//	 }
// }
// 
// class Dog implements Animal
// {
//	 public void eat()
//	 {
//		 System.out.println("nara");	 
//	 }
//	 public void sound()
//	 {
//		 System.out.println("bark");
//		 
//		 
//			 System.out.println(name);	 
//		 
//	 }
// }
//public class inter_face {
//public static void main(String[] args) {
//	Dog d=new Dog();
//	d.eat();
//	d.sound();
//}
//}

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


