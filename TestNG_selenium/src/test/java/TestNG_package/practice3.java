package TestNG_package;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class practice3 {
WebDriver driver;
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
 @BeforeTest
 public void beforeTest() {
	 
	        driver = new ChromeDriver();
	        driver.get("https://www.amazon.in/");
	        driver.manage().window().maximize();
	        System.out.println("Pre-requisite: Opened amozon homepage");
	        
	    }
  
 @Test(priority=1)
  public void login() throws InterruptedException{
	  driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.id("ap_email_login")).sendKeys("9704714559");
	  Thread.sleep(1000);
	  driver.findElement(By.className("a-button-input")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.id("ap_password")).sendKeys("nara1234");
	  Thread.sleep(1000);
	  driver.findElement(By.id("signInSubmit")).click();	  
  }
 
 @Test(priority=2,dependsOnMethods="login")
 public void search() throws InterruptedException {
     List<String> items = new ArrayList<>();
     items.add("toys");
     items.add("mobile");
     items.add("cars");

     for (String item : items) {
         driver.findElement(By.id("twotabsearchtextbox")).clear();
         driver.findElement(By.id("twotabsearchtextbox")).sendKeys(item);
         Thread.sleep(1000);
         driver.findElement(By.id("nav-search-submit-button")).click();
         Thread.sleep(2000); 
     }
 }
 
 @Test(priority=3,dependsOnMethods="login")
 public void logout() throws InterruptedException{
	  driver.findElement(By.xpath("//button[@aria-label='Expand Account and Lists']")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id=\"nav-item-signout\"]/span")).click();
	  Thread.sleep(2000);
 }
}
