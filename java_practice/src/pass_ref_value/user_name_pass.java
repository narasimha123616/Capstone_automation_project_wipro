package pass_ref_value;
//pass by reference
 class user_name
 {
	 String username;
	 String password;
 }
public class user_name_pass {
static void update_cred(user_name up)
{
	up.username="abc123";
	up.password="abc@123";
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		user_name up=new user_name();
		up.username="a123";
		up.password="abc@1";
		update_cred(up);
		System.out.println(up.username);
		System.out.println(up.password);
	}

}

//package Pass_value_refference;
//
////Pass by value
//
//
//public class Username_password1{
//	String username,
//	 password;
//	static void update_credentials1(String username,
//	String password)
//	{
//		username="admin123";
//		password="Admin@123";
//	}
//	public static void main(String[] args) {
//		Username_password1 up1=new Username_password1();
//		up1.username="User123";
//		up1.password="User@123";
//		update_credentials1("admin123","Pass@123");
//		System.out.println("Username="+up1.username);
//		System.out.println("password="+up1.password);
//	}
//
//}

