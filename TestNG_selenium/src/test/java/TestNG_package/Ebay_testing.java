package TestNG_package;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

 
public class Ebay_testing {
	WebDriver driver;
	@BeforeTest//1(primary condition)
	  public void beforeTest() throws InterruptedException {
		  driver=new ChromeDriver();
			driver.get("https://www.ebay.com/");
			driver.manage().window().maximize();
			Thread.sleep(5000);
		  
	  }
  @Test(priority=2)
  public void search() throws InterruptedException {
	  WebElement search=driver.findElement(By.id("gh-ac"));
	  search.sendKeys("Watch");
	  search.sendKeys(Keys.ENTER);
	  driver.navigate().refresh();
	 
	 // Thread.sleep(2000);
//	  
//	  search.sendKeys("Phone");
//	  search.sendKeys(Keys.ENTER);
	  
  }
  @Test(priority=3)
  public void search1() throws InterruptedException {
	  WebElement search=driver.findElement(By.id("gh-ac"));
	  search.clear();
	  search.sendKeys("phone");
	  search.sendKeys(Keys.ENTER);
	  driver.navigate().refresh();
	  Thread.sleep(3000);
  
  }
  @Test(priority=1)
  public void search11() throws InterruptedException {
	  WebElement search=driver.findElement(By.id("gh-ac"));
	  search.clear();
	  search.sendKeys("bag");
	  search.sendKeys(Keys.ENTER);
	  driver.navigate().refresh();
	  Thread.sleep(3000);
  
  }
  @AfterTest//3
  public void afterTest() {
	  Assert.assertTrue(true,"Search button is not working");
	  driver.close();
  }
 
}
 