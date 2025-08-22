package Basic_oops;

public class employee {
employee()
		{
			
			System.out.println("Default argumnet");
		}
employee(int id,String name){
	System.out.println("id"+id);
	System.out.println("name"+name);
}
employee(String name,int id){
	System.out.println("id="+id);
	System.out.println("name="+name);
}
public static void main(String[] args) {
	employee syra = new employee("nara",31);
}
}

