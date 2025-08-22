package This_keyword;

public class All_example {
void display(All_example e)
{
	System.out.println("somethimg");
}
void show()

{
display(this);
System.out.println("some");
}

All_example()
{
	System.out.println("byee");
}

public  static  void mian(String[] args)
{
	All_example ex = new All_example();
	ex.display(ex);
	
}
}
