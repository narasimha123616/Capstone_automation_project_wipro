package SRC_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkTextExample {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://demoqa.com/automation-practice-form");
	        Thread.sleep(3000);
	        
	      driver.findElement(By.linkText("wheels"));  
	     // driver.findElement(By.partialLinkText("wheels ")).click();
	}

}
