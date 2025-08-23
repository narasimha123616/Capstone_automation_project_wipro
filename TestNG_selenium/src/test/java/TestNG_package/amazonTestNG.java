package TestNG_package;

import java.time.Duration;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class amazonTestNG {
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
 
 @Test(priority=2)
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
 
 @Test(priority=3)
 public void addtocartANDdelete() throws InterruptedException{
	   driver.findElement(By.id("twotabsearchtextbox")).clear();
       driver.findElement(By.id("twotabsearchtextbox")).sendKeys("toys");
       Thread.sleep(1000);
       driver.findElement(By.id("nav-search-submit-button")).click();
       Thread.sleep(2000);
       driver.findElement(By.id("a-autoid-1-announce")).click();
       Thread.sleep(2000);
       driver.findElement(By.id("nav-cart")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//input[@value='Delete']")).click();
       Thread.sleep(2000);
       
 }
 
 @Test(priority=4)
 public void changeloginName() throws InterruptedException {
	    driver.findElement(By.xpath("//button[@aria-label='Expand Account and Lists']")).click();

	    Thread.sleep(2000);
	    driver.findElement(By.className("sc-fqkvVR sc-iEXKAA lajAPo kHDgFV")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.className("sc-iGgWBj sc-fHjqPf fErbOa bdPZUm")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.className("editNameIcon"));
	    Thread.sleep(2000);
	    WebElement nameField=  driver.findElement(By.id("editProfileNameInputId"));
	    nameField.click();
	    nameField.clear();
	    nameField.sendKeys("Simha");
	    Thread.sleep(2000);
	    driver.findElement(By.id("editProfileContinueButton")).click();
	    Thread.sleep(2000);
	}

 @Test(priority=5)
 public void shopbycategories()  throws InterruptedException {
      driver.findElement(By.id("nav-hamburger-menu")).click();
      Thread.sleep(3000);
      driver.findElement(By.linkText("Echo & Alexa")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/div[20]/section/ul/li/a")).click();
      Thread.sleep(2000);   
 }
 
 @Test(priority=6)
 public void productDiscrimination()  throws InterruptedException {
	 driver.findElement(By.id("twotabsearchtextbox")).clear();
     driver.findElement(By.id("twotabsearchtextbox")).sendKeys("cars");
     Thread.sleep(2000);
     driver.findElement(By.id("nav-search-submit-button")).click();
     Thread.sleep(2000); 
     WebElement prod = driver.findElement(By.cssSelector("div.s-main-slot h2 a span"));
     Thread.sleep(2000);
     String productTitle = prod.getText();
     Thread.sleep(2000);
     System.out.println(productTitle);
   
}
 @Test(priority=7)
 public void changeLanguage()  throws InterruptedException {
	 driver.findElement(By.cssSelector("div#icp-nav-flyout")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//*[@id=\"icp-language-settings\"]/div[5]")).click();
     Thread.sleep(2000);
     driver.findElement(By.cssSelector("input.a-button-input")).click();
 }
 
 @Test(priority=9)
 public void changeAddress() throws InterruptedException {
	    // Click the location selector
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
