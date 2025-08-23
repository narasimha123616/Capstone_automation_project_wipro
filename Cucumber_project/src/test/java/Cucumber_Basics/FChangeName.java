package Cucumber_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class FChangeName {
	WebDriver driver;
	@Given("Ebay website able to change Name")
	public void ebay_website_able_to_change_name() {
		driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        System.out.println("Pre-requisite: Opened eBay homepage");
	}

	@And("change the Name")
	public void change_the_name() throws InterruptedException{
			
		 driver.findElement(By.linkText("Sign in")).click();
	        Thread.sleep(2000);

	        driver.findElement(By.id("userid")).sendKeys("erannacom71@gmail.com");
	        driver.findElement(By.id("signin-continue-btn")).click();
	        Thread.sleep(2000);

	        driver.findElement(By.id("pass")).sendKeys("Nara@123"); 
	        Thread.sleep(1000);
	        driver.findElement(By.id("sgnBt")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.linkText("My eBay")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.linkText("Account")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.linkText("Personal information")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.id("pass")).sendKeys("Nara@123"); 
	        Thread.sleep(1000);
	        driver.findElement(By.id("sgnBt")).click();
	        Thread.sleep(3000);
	        JavascriptExecutor js2 = (JavascriptExecutor) driver;
	        js2.executeScript("window.scrollTo(0, 100);");
	        driver.findElement(By.id("individual_personal_info_address_edit_button")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.id("stateOrProvince")).click();
	        JavascriptExecutor js1 = (JavascriptExecutor) driver;
	        js1.executeScript("window.scrollTo(0, 100);");
	        Thread.sleep(2000);
	        driver.findElement(By.cssSelector("select option:nth-child(5)")).click();
	        Thread.sleep(2000);
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollTo(0, 100);"); 
	        driver.findElement(By.id("address_edit_submit_button")).click();
	        Thread.sleep(2000);
	}

	@Then("displayed  Name changing")
	public void displayed_name_changing() {
	    System.out.println("Changed name");
	}
}
