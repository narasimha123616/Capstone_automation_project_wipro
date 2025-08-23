package TestNG_package;

import org.testng.annotations.Test;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.AfterClass;

public class practice1 {
WebDriver driver;
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
 @BeforeTest
 public void beforeTest() {
	 
	        driver = new ChromeDriver();
	        driver.get("https://www.amazon.in/");
	        driver.manage().window().maximize();
	        System.out.println("Pre-requisite: Opened amozon homepage");
	        
	    }
  
 @Test(priority=1, enabled = true)
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
 
 @Test(priority=2, enabled = false)
 public void changeAddress() throws InterruptedException {
	    driver.findElement(By.id("glow-ingress-line2")).click();
	    Thread.sleep(2000);
	    WebElement pincodeInput = driver.findElement(By.id("GLUXZipUpdateInput"));
	    pincodeInput.clear();
	    pincodeInput.sendKeys("500081");  
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@aria-labelledby='GLUXZipUpdate-announce']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[@name='glowDoneButton']")).click();
	}

 
}
