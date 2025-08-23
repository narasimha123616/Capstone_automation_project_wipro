package TestNG_package;

import java.time.Duration;
//import java.util.ArrayList;
//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class practice2 {
WebDriver driver;
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
 @BeforeTest
 public void beforeTest() {
	 
	        driver = new ChromeDriver();
	        driver.get("https://www.amazon.in/");
	        driver.manage().window().maximize();
	        System.out.println("Pre-requisite: Opened amozon homepage");
	        
	    }
@Test(priority=1,invocationCount=4)
public void search() throws InterruptedException {
   
        driver.findElement(By.id("twotabsearchtextbox")).clear();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("toys");
        Thread.sleep(1000);
        driver.findElement(By.id("nav-search-submit-button")).click();
        Thread.sleep(2000); 
    }
}

