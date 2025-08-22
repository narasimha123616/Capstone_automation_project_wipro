
public class Encapsu_example {
public String username="nara";
private String password;

public void getname() {
	System.out.println(username);
}

public void getage()
{
	System.out.println(password);
}


public static void main(String[] args)
{
	Encapsu_example s= new Encapsu_example();
	s.getname();
	s.getage();
}
}
