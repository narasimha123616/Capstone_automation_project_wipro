package This_keyword;

public class this_example {
int rollno,age;
String name, colleganame;
float per;
char a;
void data(int rollno,String name,float per)
{
	this.rollno=rollno;
	this.name=name;
	this.per=per;
	System.out.println("rollno ="+rollno);
	System.out.println("name ="+name);
	System.out.println("name ="+per);
	}

void data(int rollno2,String name2)
{
	this.rollno=rollno2;
	this.name=name2;
	System.out.println("rollno ="+rollno);
	System.out.println("name ="+name);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		this_example ex =new this_example();
		ex.data(0, "name",58);
		ex.data(1, "n");
	}

}
