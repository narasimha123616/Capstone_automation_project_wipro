package SRC_selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertsExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://demoqa.com/alerts");
	        Thread.sleep(3000);
	        
	        //sample alert(accept)
	        //confirmation alert(alert or cancel)
	        //prompt alerts(add input and then accept or cancel)
//	        JavascriptExecutor js = (JavascriptExecutor) driver;
//	        js.executeScript("window.scrollBy(0,400)");
//	        
	      WebElement samplealert =  driver.findElement(By.id("alertButton"));
	      samplealert.click();
	      Thread.sleep(4000);
	      Alert alert=driver.switchTo().alert();
	       alert.accept(); 
	       Thread.sleep(3000);
	       
	       
	       WebElement timealert =  driver.findElement(By.id("timerAlertButton"));
		      timealert.click();
		      Thread.sleep(5000);
		      Alert alert3=driver.switchTo().alert();
		       alert3.accept(); 
		       Thread.sleep(3000);
	       
	       WebElement confirmalert =  driver.findElement(By.id("confirmButton"));
		      confirmalert.click();
		      Thread.sleep(3000);
		      Alert alert1=driver.switchTo().alert();
		       alert1.accept(); 
		       Thread.sleep(3000);
		       
		       
		       Thread.sleep(4000);
		       WebElement promptalert =  driver.findElement(By.id("promptButton"));
			      promptalert.click();
			      Thread.sleep(6000);
			      Alert alert2=driver.switchTo().alert();
			    alert2.sendKeys("warning");
			      alert2.accept(); 
			       
	}

}
