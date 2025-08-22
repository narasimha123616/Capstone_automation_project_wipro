package Basic_oops;

class Animal
{
	void eat(String eats)
	{
		System.out.println("Eats="+eats);
	}
	void sound(String sd)
	{
		System.out.println("sound="+sd);
	}
}

class D_animal extends Animal
{
	void lives(String live)
	{
		System.out.println("Lives in the"+live);
	}
}
public class Inheritance_example {
 public static void main(String[] args)
 {
	 D_animal dog=new D_animal();
	 System.out.println("Dog");
	 dog.eat("pedigree");
	 dog.sound("bow");
	 dog.lives("city");
 }
}
