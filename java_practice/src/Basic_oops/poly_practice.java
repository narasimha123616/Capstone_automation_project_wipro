package Basic_oops;
//overloading
public class poly_practice {
    void details(int rollno)
    {
    	System.out.println("Rollno="+rollno);
    }
	 void details(int rollno,String name)
	 {
		 System.out.println("Rollno="+rollno);
		 System.out.println("name="+name);
	 }
	 void details(String name,int rollno)
	 {
		 System.out.println("Rollno="+rollno);
		 System.out.println("name="+name);
	 }
	 
	 public static void main(String[] args)
	 {
		 poly_practice ps =new poly_practice();
		 
			 ps.details(101);
			 ps.details("narasimha",12);
			 ps.details(18,"hjsdjd");
	 }
	 
}
