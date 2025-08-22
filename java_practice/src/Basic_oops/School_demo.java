package Basic_oops;
class School
{
	School()
	{
		System.out.println("unitorm");
		System.out.println("fixed syllubus");
		System.out.println("timings 7 to 5");
	}
}
class prathibha extends School
{
	prathibha()
	{
		super();
		System.out.println("conduct weekend exams");
		System.out.println("cultural activities");
	}
}
public class School_demo {
public static void main(String[] args) {
	prathibha tb =new prathibha();
	
}
}
