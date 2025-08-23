package TestNG_package;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeTest;

public class assert_demo {
 WebDriver driver;
  @BeforeClass
  public void beforeClass() {

      driver = new ChromeDriver();
      driver.get("https://www.amazon.in/");
      driver.manage().window().maximize();
  }

  @Test
  public void tilte() {
	  String expectedtitle="amazon";
	  String actualtitle=driver.getTitle();
	  Assert.assertEquals(expectedtitle,actualtitle,"failed");
	  System.out.println(expectedtitle);
	  System.out.println(actualtitle); 
  }
  
  @Test
  public void url() {
	  String expectedurl="https://www.amazon.in/";
	  String actualurl=driver.getCurrentUrl();
	  Assert.assertEquals(expectedurl,actualurl,"failed");
	  System.out.println(expectedurl);
	  System.out.println(actualurl); 
  }

  @AfterClass
  public void beforeTest() {
	  driver.close();
  }

}
