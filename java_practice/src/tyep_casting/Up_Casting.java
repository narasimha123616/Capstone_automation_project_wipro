package tyep_casting;
 class Test
 {
	 void display()
	 {
		 System.out.println("Hello");
	 }
 }
 class Test1 extends Test
 {
	 void display()
	 {
		 System.out.println("welcome");
	 }
	 void show()
	 {
		 System.out.println("come");
	 }
 }
public class Up_Casting {
public static void main(String[] args)
{
	Test t1=new Test();
	t1.display();
	Test tt  =new Test1();//upcasting
	tt.display();
	Test1 t=(Test1)tt;//downcasting
	t.display();
	t.show();
	
}
}
