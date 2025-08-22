package Variable_practice;

public class student_details {
int rollno ,age;
float per;
String name;
static String collegename="JVM";
void details(int rollno1,int age1,String name1,float per1)
{
	rollno=rollno1;
	age=age1;
	per=per1;
	name=name1;
	System.out.println("rollno-"+collegename);
	System.out.println("rollno-"+rollno);
	System.out.println("age-"+age);
	System.out.println("name-"+rollno);
	System.out.println("per-"+per);
}
public static void main(String[] args) {
	student_details stud=new student_details();
	System.out.println("1st");
	stud.details(101,20,"nara",92.9f);
	
}
}
