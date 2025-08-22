package pass_ref_value;

public class pass_by_value_ref {
String name="hi";
void show(String name1)
{
	name=name1;
	System.out.println(name);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
pass_by_value_ref obj= new pass_by_value_ref();
 System.out.println(obj.name);
 obj.show("byee");
	}

}
