package Exception_ex;

public class Excep_Ex2 {
 void add(int a, int b) {
	 int sum=a+b;
			System.out.println(sum); 
 }
 void div(int a, int b) throws ArithmeticException
 {
	 int d =a/b;
			System.out.println(d); 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Excep_Ex2 e=new Excep_Ex2();
e.add(10, 50);
e.div(20, 0);
	}

}
