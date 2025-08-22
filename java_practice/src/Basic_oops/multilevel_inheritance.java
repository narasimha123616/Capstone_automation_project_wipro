package Basic_oops;


class Nara
{
	void surname() {
		System.out.println("2bhk");
	}
	void car() {
		System.out.println("lenovo");
	}
}


class simha extends Nara
{
	void bike()
	{
		System.out.println("pulsar");
	}
	void job()
	{
		System.out.println("tester");
	}
}
 
class narasimha extends simha
{
	void jeans()
	{
		System.out.println("colour");
	}
	void dna()
	{
		System.out.println("matches");
	}
}


public class multilevel_inheritance {
	public static void main(String[] args) {
		 simha son = new simha();
		 son.bike();
		 son.surname();
		 son.car();
		 son.job();
		 System.out.println("pulsar");
		 narasimha syra = new narasimha();
		 syra.jeans();
		 syra.dna();
	 }
}
