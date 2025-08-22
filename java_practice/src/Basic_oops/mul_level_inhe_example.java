package Basic_oops;

class vehicles
{
	void types()
	{
		System.out.println("types");
	}
}

class four_wheelers extends vehicles
{
	void Fourwheelers()
	{
		System.out.println("car");
		
	}
}
class petrol_four_wheeler extends four_wheelers
{
	void petrol_four_car()
	{
		System.out.println("petrol_car_four_seeter_");
	}
}

class five_seeter_petrol_car extends petrol_four_wheeler
{
	
	void petrol_five_car()
	{
		System.out.println("petrol_car_five_seeter");
	}
}
class Baleno_five_seeter_petrol_four_wheeler extends five_seeter_petrol_car
{
	void baleno()
	{
		System.out.println("Baleno_car");
	}
}
public class mul_level_inhe_example {
public static void main(String[] args) {
	Baleno_five_seeter_petrol_four_wheeler cars = new Baleno_five_seeter_petrol_four_wheeler();
	cars.types();
	cars.Fourwheelers();
	cars.petrol_four_car();
	cars.petrol_five_car();
	cars.baleno();
	
	
	
}
}
