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
public class Inheritance {
 public static void main(String[] args) {
	 simha son = new simha();
	 son.bike();
	 son.surname();
	 son.car();
	 son.job();
	 System.out.println("pulsar");
 }
}

