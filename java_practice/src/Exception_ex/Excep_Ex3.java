package Exception_ex;

public class Excep_Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="hello";
if(name==null)
{
	throw new NullPointerException("Name is not null");
	
}
System.out.println(name.length());
	}

}
