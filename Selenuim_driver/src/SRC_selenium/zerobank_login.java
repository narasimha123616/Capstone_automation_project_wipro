package SRC_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class zerobank_login {

	public static void main(String[] args) throws InterruptedException{
//		// TODO Auto-generated method stub
//		  WebDriver driver = new ChromeDriver();
//	        driver.get("http://zero.webappsecurity.com/login.html");
//	     System.out.println("welcome zero bank login");
//	     {
//	    	 System.out.println("valid credentials");
//	     }
//	     
//	     //lacating username text field
//	     driver.findElement(By.id("user_login")).click();
//	     driver.findElement(By.id("user_login")).sendKeys("username");
//	     
//	        
//	     //locating password text field
//	     driver.findElement(By.id("user_password")).click();
//	     driver.findElement(By.id("user_password")).sendKeys("password1");
//	     
//	     //click on submit button
//	     driver.findElement(By.id("submit")).click();
//	  //  System.out.println("login successfully");
//	    
//	    Thread.sleep(3000);
//	    
//	    System.out.println("login failed");
//	    {
//	    	System.out.println("valid credentials");
//	    }
//	    
//	    //locating username text field
//	    driver.findElement(By.id("user_login")).click();
//	     driver.findElement(By.id("user_login")).sendKeys("7868698");
//	     
//	        
//	     //locating password text field
//	     driver.findElement(By.id("user_password")).click();
//	     driver.findElement(By.id("user_password")).sendKeys("password");
//	     
//	     //click on submit button
//	     driver.findElement(By.id("sign in")).click();
//	     System.out.println("login unsuccessfully");
//	    
//         Thread.sleep(3000);
//	    
//	     System.out.println("login failed");
//	     {
//	    	System.out.println("valid credentials");
//	     }
//	    
//	     driver.findElement(By.id("user_login")).click();
//	     driver.findElement(By.id("user_login")).sendKeys("username");
//	     
//	        
//	     //locating password text field
//	     driver.findElement(By.id("user_password")).click();
//	     driver.findElement(By.id("user_password")).sendKeys("6rvfhg");
//	     
//	     //click on submit button
//	     driver.findElement(By.id("sign in")).click();
//	     System.out.println("login successfully");
//     
//	    
//	     System.out.println("login failed");
//	    {
//	    	System.out.println("valid credentials");
//	    }
//	    
//	   
//	     driver.close();
//	     
//	}
	
	WebDriver driver=new ChromeDriver();
	driver.get("http://zero.webappsecurity.com/login.html");
	System.out.println("Welcome to Zero bank Login page");
	
	{
		System.out.println("Manual test::-->Check user is unable to login with "
				+ "invalid username and valid password credentials");
	}
	//locating username text field
	
	driver.findElement(By.id("user_login")).click();
	driver.findElement(By.id("user_login")).sendKeys("8875675");
	// locating password text field
	driver.findElement(By.id("user_password")).click();
	driver.findElement(By.id("user_password")).sendKeys("password");
	
	// click on signin button
	driver.findElement(By.name("submit")).click();
	Thread.sleep(6000);
	System.out.println("Login unsuccessfully");
	
	{
		System.out.println("Manual test::-->Check user is unable to login with "
				+ "valid username and invalid password credentials");
	}
	//locating username text field
	//driver.get("http://zero.webappsecurity.com/login.html");
	driver.findElement(By.id("user_login")).click();
	driver.findElement(By.id("user_login")).sendKeys("username");
	// locating password text field
	driver.findElement(By.id("user_password")).click();
	driver.findElement(By.id("user_password")).sendKeys("jhal86765");
	
	// click on signin button
	driver.findElement(By.name("submit")).click();
	Thread.sleep(6000);
	System.out.println("Login unsuccessfully");
	
	{
		System.out.println("Manual test::-->Check user is unable to login with "
				+ "invalid username and invalid password credentials");
	}
	//locating username text field
	//driver.get("http://zero.webappsecurity.com/login.html");
	driver.findElement(By.id("user_login")).click();
	driver.findElement(By.id("user_login")).sendKeys("8875675");
	// locating password text field
	driver.findElement(By.id("user_password")).click();
	driver.findElement(By.id("user_password")).sendKeys("987534");
	
	// click on signin button
	driver.findElement(By.name("submit")).click();
	Thread.sleep(6000);
	System.out.println("Login unsuccessfully");
	
	{
		System.out.println("Manual test::-->Check user is unable to login with null credentials");
	}
	//locating username text field
	//driver.get("http://zero.webappsecurity.com/login.html");
	driver.findElement(By.id("user_login")).click();
	driver.findElement(By.id("user_login")).sendKeys("");
	// locating password text field
	driver.findElement(By.id("user_password")).click();
	driver.findElement(By.id("user_password")).sendKeys("");
	
	// click on signin button
	driver.findElement(By.name("submit")).click();
	Thread.sleep(6000);
	System.out.println("Login unsuccessfully");
	{
		System.out.println("Manual test::-->Check user is able to login with "
				+ "valid username and valid password ");
	}
	//locating username text field
	//driver.get("http://zero.webappsecurity.com/login.html");
	driver.findElement(By.id("user_login")).click();
	driver.findElement(By.id("user_login")).sendKeys("username");
	// locating password text field
	driver.findElement(By.id("user_password")).click();
	driver.findElement(By.id("user_password")).sendKeys("password");
	
	// click on signin button
	driver.findElement(By.name("submit")).click();
	//driver.findElement(By.id("logout_link"));
	System.out.println("Login successfully");
	
	driver.close();
	

}



}
