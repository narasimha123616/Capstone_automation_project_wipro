package Basic_oops;
class softwareTesting
{
	int speeed=29;
	void Syllabus()
	{
		System.out.println("software testing course details");
		System.out.println("Syllabus=manual testing,core java,salenium");
		System.out.println(5000);
		System.out.println(this.speeed);
	
	}
}
 class Manual extends softwareTesting
 {
	 void manual_testing()
	 {
		 super.Syllabus();
		 System.out.println("manual testing course details");
		 System.out.println(super.speeed);
	 }
 }
 class Automation extends softwareTesting
 {
	 void automation_testing()
	 {
		 super.Syllabus();
		 System.out.println("Automation testing course details");
		 
	 }
 }
public class super_example {
 public static void main(String[] args) {
	 Manual mn=new Manual();
	 mn.manual_testing();
	 Automation at=new Automation();
	 at.automation_testing();
 }
}
