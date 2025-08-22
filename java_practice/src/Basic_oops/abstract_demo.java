package Basic_oops;


abstract class Vehicle
{
	abstract void no_of_tyre();
	abstract void no_of_seats();
	abstract void run_on();
	
	void start_stop()
	{
		System.out.println("vehicles");
	}
}

class Car extends Vehicle
{
	void no_of_tyre()
	{
		System.out.println("a");
	}
	void no_of_seats()
	{
		System.out.println("c");
	}
	void run_on()
	{
		System.out.println("d");
	}
}
class Cscooter extends Vehicle
{
	void no_of_tyre()
	{
		System.out.println("a");
	}
	void no_of_seats()
	{
		System.out.println("c");
	}
	void run_on()
	{
		System.out.println("d");
	}
}

public class abstract_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
